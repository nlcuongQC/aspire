package cucumberoption;

import commons.GlobalConstants;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    private static final Logger    log = Logger.getLogger(Hooks.class.getName());
    private static       WebDriver driver;

    @Before // synchronized = handle đồng bộ
    public synchronized static WebDriver getAndCloseBrowser() {
        // Run by Maven command line
        String browser = System.getProperty("BROWSER");
        System.out.println("Browser name run by command line = " + browser);

        // Check driver đã được khởi tạo hay chưa?
        if (driver == null) {

            // Happy path case
            try {
                // Kiem tra BROWSER = null -> gan = chrome/ firefox (browser default for project)
                if (browser == null) {
                    // Get browser name from Environment Variable in OS
                    browser = System.getenv("BROWSER");
                    if (browser == null) {
                        // Set default browser
                        browser = "chrome";
                    }
                }

                switch (browser) {
                    case "hchrome":
                        WebDriverManager.chromedriver().version("88.0.4324.96").setup();
                        ChromeOptions chromeOptions = new ChromeOptions();
                        chromeOptions.addArguments("headless");
                        chromeOptions.addArguments("window-size=1920x1080");
                        driver = new ChromeDriver(chromeOptions);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE, "true");
                        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "/dev/null");
                        driver = new FirefoxDriver();
                        break;
                    default:
                        WebDriverManager.chromedriver().version("88.0.4324.96").setup();
                        driver = new ChromeDriver();
                        break;
                }
                // Browser crash/ stop
            } finally {
                Runtime.getRuntime().addShutdownHook(new Thread(new BrowserCleanup()));
            }

            driver.manage().timeouts().implicitlyWait(GlobalConstants.LONG_TIMEOUT, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            log.info("------------- Started the browser -------------");
        }
        return driver;
    }

    public static void closeBrowserAndDriver() {
        try {
            String osName = System.getProperty("os.name").toLowerCase();
            log.info("OS name = " + osName);

            String cmd = "";
            if (driver != null) {
                driver.quit();
            } else if (driver.toString().toLowerCase().contains("chrome") && osName.toLowerCase().contains("window")) {
                System.out.println(driver);
                cmd = "taskkill /F /FI \"IMAGENAME eq chromedriver*\"";
            }

            Process process = Runtime.getRuntime().exec(cmd);
            process.waitFor();

            log.info("---------- QUIT BROWSER SUCCESS ----------");
        } catch (Exception e) {
            log.info(e.getMessage());
        }
    }

    private static class BrowserCleanup implements Runnable {
        @Override
        public void run() {
            closeBrowserAndDriver();
        }
    }

}