package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import static interfaces.IncorporateSelectorPageUI.*;

public class IncorporateSelectorPage extends AbstractPage {
    WebDriver driver;

    public IncorporateSelectorPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, REGISTERED_CONTINUE_BTN);
        return isElementDisplayed(driver, REGISTERED_CONTINUE_BTN);
    }

    public void clickToRegisterContinueBtn() {
        waitElementClickable(driver, REGISTERED_CONTINUE_BTN);
        clickToElement(driver, REGISTERED_CONTINUE_BTN);
    }
}
