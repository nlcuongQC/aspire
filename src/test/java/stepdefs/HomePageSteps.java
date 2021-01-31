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

public class HomePageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    HomePage homePage;

    public HomePageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();
        driver.get(GlobalConstants.URL);
        homePage = PageGeneratorManager.getHomePage(driver);
    }

    @Given("^homepage is opened$")
    public void homepage_is_opened() {
        verify.verifyTrue(homePage.isAt());
    }

    @And("^I open Register page$")
    public void i_open_register_page() {
        homePage.clickToRegisterBtn();
    }


}
