package stepdefs;

import commons.PageGeneratorManager;
import commons.VerifyHelper;
import cucumberoption.Hooks;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebDriver;
import pageobjects.PersonalDetailsPage;
import pageobjects.RegisterSelectMethodPage;

public class PersonalDetailsPageSteps {
    WebDriver    driver;
    VerifyHelper verify;

    PersonalDetailsPage personalDetailsPage;

    public PersonalDetailsPageSteps() {
        driver = Hooks.getAndCloseBrowser();
        verify = VerifyHelper.getVerify();

        personalDetailsPage = PageGeneratorManager.getPersonalDetailsPage(driver);
    }

    @And("Personal details page is opened")
    public void personal_details_page_is_opened() {
        personalDetailsPage.isAt();
    }

    @And("I click to Get started button in Person details")
    public void i_click_to_get_started_button_in_person_details() {
        personalDetailsPage.clickToGetStartedBtn();
    }

    @And("I choose date of birth")
    public void i_choose_date_of_birth() {
        personalDetailsPage.chooseDate();
    }

    @And("I choose Nationality ddl is {}")
    public void i_choose_nationality_ddl_is(String nation) {
        personalDetailsPage.chooseNationalityDDL(nation);
    }

    @And("I choose Gender ddl is {}")
    public void i_choose_gender_ddl_is_male(String gender) {
        personalDetailsPage.chooseGenderDDL(gender);
    }

    @And("I choose interested products")
    public void i_choose_interested_products() {
        personalDetailsPage.chooseInterestedProducts("Credit Line");
    }

    @And("I click Submit Person details button")
    public void i_click_submit_person_details_button() {
        personalDetailsPage.clickToSubmitBtn();
    }
}
