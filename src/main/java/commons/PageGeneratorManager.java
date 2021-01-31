package commons;

import org.openqa.selenium.WebDriver;
import pageobjects.*;

public class PageGeneratorManager {
    public static HomePage getHomePage(WebDriver driver) {
        return new HomePage(driver);
    }

    public static RegisterPage getRegisterPage(WebDriver driver) {
        return new RegisterPage(driver);
    }

    public static MobileOTPPage getMobileOTPPage(WebDriver driver) {
        return new MobileOTPPage(driver);
    }

    public static RegisterCompletePage getRegisterCompletePage(WebDriver driver) {
        return new RegisterCompletePage(driver);
    }

    public static IncorporateSelectorPage getIncorporateSelectorPage(WebDriver driver) {
        return new IncorporateSelectorPage(driver);
    }

    public static RegisterSelectMethodPage getRegisterSelectMethodPage(WebDriver driver) {
        return new RegisterSelectMethodPage(driver);
    }

    public static PersonalDetailsPage getPersonalDetailsPage(WebDriver driver) {
        return new PersonalDetailsPage(driver);
    }

    public static BusinessDetailsPage getBusinessDetailsPage(WebDriver driver) {
        return new BusinessDetailsPage(driver);
    }
}
