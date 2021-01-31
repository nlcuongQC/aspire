package stepdefs;

import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjects.RegisterCompletePage;

public class RegisterCompletePageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    RegisterCompletePage registerCompletePage;

    public RegisterCompletePageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        registerCompletePage = PageGeneratorManager.getRegisterCompletePage(driver);
    }

    @And("I should see Register complete page is opened")
    public void i_should_see_register_complete_page_is_opened() {
        verify.verifyTrue(registerCompletePage.isAt());
    }

    @And("I click to Continue button in complete page")
    public void i_click_to_continue_button_in_complete_page() {
        registerCompletePage.clickToContinueBtn();
    }
}
