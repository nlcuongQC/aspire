package stepdefs;

import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjects.IncorporateSelectorPage;

public class IncorporateSelectorPageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    IncorporateSelectorPage incorporateSelectorPage;

    public IncorporateSelectorPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        incorporateSelectorPage = PageGeneratorManager.getIncorporateSelectorPage(driver);
    }

    @And("Incorporate selector page is opened")
    public void incorporate_selector_page_is_opened() {
        verify.verifyTrue(incorporateSelectorPage.isAt());
    }

    @And("I click to registered business continue button")
    public void i_click_to_registered_business_continue_button() {
        incorporateSelectorPage.clickToRegisterContinueBtn();
    }
}
