package stepdefs;

import commons.DataHelper;
import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pageobjects.RegisterPage;

public class RegisterPageSteps {
    static String fullname, email, phone, role, whereHeard;
    WebDriver    driver;
    VerifyHelper verify;
    DataHelper   data;
    RegisterPage registerPage;

    public RegisterPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();
        data   = DataHelper.getData();

        fullname   = data.getFullname();
        email      = data.getEmail();
        phone      = data.getPhone();
        role       = "Appointed director";
        whereHeard = "Facebook";

        registerPage = PageGeneratorManager.getRegisterPage(driver);
    }

    @Then("^I should see Continue button is disabled$")
    public void i_should_see_continue_button_is_disabled() {
        verify.verifyTrue(registerPage.isContinueBtnDisabled());
    }

    @When("I input {} with {}")
    public void i_input_txtbx_with_something(String txtbxName, String value) {
        registerPage.inputToDynamicTxtbx(txtbxName, value);
    }

    @Then("I should see {} error {}")
    public void i_should_see_txtbx_error_something(String txtbxName, String errorTxt) {
        verify.verifyEquals(registerPage.getDynamicErrorTxt(txtbxName), errorTxt);
    }

    @When("I fill register form with valid data")
    public void i_fill_register_form() {
        registerPage.inputToDynamicTxtbx("full_name", fullname)
                    .inputToDynamicTxtbx("email", email)
                    .inputToDynamicTxtbx("phone", phone)
                    .chooseRoleRadioBtn(role)
                    .chooseWhereHeardDDL(whereHeard)
                    .checkTCcheckbx();
    }

    @And("I click to Continue button")
    public void i_click_continue_btn() {
        registerPage.clickToContinueBtn();
    }
}
