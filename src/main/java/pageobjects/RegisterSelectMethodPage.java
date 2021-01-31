package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import static interfaces.RegisterSelectMethodPageUI.*;

public class RegisterSelectMethodPage extends AbstractPage {
    WebDriver driver;

    public RegisterSelectMethodPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, STANDARD_GET_STARTED_BTN);
        return isElementDisplayed(driver, STANDARD_GET_STARTED_BTN);
    }

    public void clickToStandardGetStartedBtn() {
        waitElementVisible(driver, STANDARD_GET_STARTED_BTN);
        clickToElement(driver, STANDARD_GET_STARTED_BTN);
    }
}
