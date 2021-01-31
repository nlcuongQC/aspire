package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import static interfaces.RegisterCompletePageUI.*;

public class RegisterCompletePage extends AbstractPage {
    WebDriver driver;

    public RegisterCompletePage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, SUCCESS_MESSAGE);
        return isElementDisplayed(driver, SUCCESS_MESSAGE);
    }

    public void clickToContinueBtn() {
        waitElementClickable(driver, CONTINUE_BTN);
        clickToElement(driver, CONTINUE_BTN);
    }
}
