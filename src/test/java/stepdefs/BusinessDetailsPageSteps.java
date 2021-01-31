package stepdefs;

import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjects.BusinessDetailsPage;
import pageobjects.RegisterSelectMethodPage;

public class BusinessDetailsPageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    BusinessDetailsPage businessDetailsPage;

    public BusinessDetailsPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        businessDetailsPage = PageGeneratorManager.getBusinessDetailsPage(driver);
    }

    @And("Business Details is opened")
    public void business_detail_is_opened() {
        verify.verifyTrue(businessDetailsPage.isAt());
    }


    @And("I click to Get started button in Business details")
    public void i_click_to_get_started_button_in_business_details() {
        businessDetailsPage.clickToGetStartedBtn();
    }

    @And("I input Business name")
    public void i_input_business_name() {
        businessDetailsPage.inputToBusinessNameTxtbx("Business Name");
    }

    @And("I choose registration type dll {}")
    public void i_choose_registration_type_dll(String type) {
        businessDetailsPage.chooseRegistrationType(type);
    }

    @And("I input UEN")
    public void i_input_uen() {
        businessDetailsPage.inputToUENTxtbx("123456789A");
    }

    @And("I choose Industry {}")
    public void i_choose_industry(String industry) {
        businessDetailsPage.chooseIndustry(industry);
    }

    @And("I choose Sub Industry {}")
    public void i_choose_sub_industry(String subIndustry) {
        businessDetailsPage.chooseSubIndustry(subIndustry);
    }

    @And("I click Submit Business details button")
    public void i_click_submit_business_details_button() {
        businessDetailsPage.clickToSubmitBtn();
    }
}
