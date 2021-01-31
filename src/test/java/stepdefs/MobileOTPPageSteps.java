package stepdefs;

import commons.GlobalConstants;
import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobjects.HomePage;
import pageobjects.MobileOTPPage;

public class MobileOTPPageSteps {
    WebDriver    driver;
    VerifyHelper verify;
    String otp;

    MobileOTPPage mobileOTPPage;

    public MobileOTPPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        otp = "1234";

        mobileOTPPage = PageGeneratorManager.getMobileOTPPage(driver);
    }

    @Then("Mobile OTP page is opened")
    public void mobile_otp_page_is_opened() {
        verify.verifyTrue(mobileOTPPage.isAt());
    }


    @And("I input OTP")
    public void i_input_otp() {
        mobileOTPPage.inputOTP(otp);
    }
}
