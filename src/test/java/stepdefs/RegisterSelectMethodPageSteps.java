package stepdefs;

import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjects.RegisterSelectMethodPage;

public class RegisterSelectMethodPageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    RegisterSelectMethodPage registerSelectMethodPage;

    public RegisterSelectMethodPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        registerSelectMethodPage = PageGeneratorManager.getRegisterSelectMethodPage(driver);
    }

    @And("Register select method page is opened")
    public void register_select_method_page_is_opened() {
        verify.verifyTrue(registerSelectMethodPage.isAt());
    }

    @And("I click to Standard registration Get started button")
    public void i_click_to_standard_registration_get_started_button() {
        registerSelectMethodPage.clickToStandardGetStartedBtn();
    }
}
