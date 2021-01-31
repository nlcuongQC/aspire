package pageobjects;

import commons.AbstractPage;
import commons.VerifyHelper;
import org.openqa.selenium.WebDriver;

import static interfaces.HomePageUI.*;

public class HomePage extends AbstractPage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, REGISTER_BTN);
        return isElementDisplayed(driver, REGISTER_BTN);
    }

    public void clickToRegisterBtn() {
        waitElementClickable(driver, REGISTER_BTN);
        clickToElement(driver, REGISTER_BTN);
    }
}
