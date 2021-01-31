package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;
import java.util.List;

import static interfaces.MobileOTPPageUI.*;

public class MobileOTPPage extends AbstractPage {
    WebDriver driver;

    public MobileOTPPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, TITLE);
        return isElementDisplayed(driver, TITLE);
    }

    public void inputOTP(String otp) {
        removeAttributeInDOM(driver, OTP_TEXTBOXES, "class");
        waitElementVisible(driver, OTP_TEXTBOXES);
        sendkeyToElement(driver, OTP_TEXTBOXES, otp);
    }
}
