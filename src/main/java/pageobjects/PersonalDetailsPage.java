package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import static interfaces.PersonalDetailsPageUI.*;

public class PersonalDetailsPage extends AbstractPage {
    WebDriver driver;

    public PersonalDetailsPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, GET_STARTED_BTN);
        return isElementDisplayed(driver, GET_STARTED_BTN);
    }

    public void clickToGetStartedBtn() {
        waitElementClickable(driver, GET_STARTED_BTN);
        clickToElement(driver, GET_STARTED_BTN);
    }

    public void chooseDate() {
        waitElementVisible(driver, DATE_OF_BIRTH_TXTBX);
        clickToElementByJS(driver, DATE_OF_BIRTH_TXTBX);
        waitElementVisible(driver, DATE_OF_BIRTH_YEAR_PARENT);
        clickToElementByJS(driver, DATE_OF_BIRTH_YEAR_PARENT);
//        sleepInSeconds(1);
        waitElementVisible(driver, DATE_OF_BIRTH_BACK_BTN);
        clickToElement(driver, DATE_OF_BIRTH_BACK_BTN);
        waitElementVisible(driver, DATE_OF_BIRTH_YEAR, "2000");
        clickToElementByJS(driver, DATE_OF_BIRTH_YEAR, "2000");
        waitElementVisible(driver, DATE_OF_BIRTH_DAY, "1");
        clickToElementByJS(driver, DATE_OF_BIRTH_DAY, "1");
    }

    public void chooseNationalityDDL(String nation) {
        selectItemsInCustomDropdownByJs(driver, NATIONALITY_DDL_PARENT, DDL_ITEMS, nation);
        waitElementInvisible(driver,DDL_ITEMS);
    }

    public void chooseGenderDDL(String gender) {
        selectItemsInCustomDropdownByJs(driver, GENDER_DDL_PARENT, DDL_ITEMS, gender);
        waitElementInvisible(driver,DDL_ITEMS);
    }

    public void chooseInterestedProducts(String products) {
        waitElementClickable(driver, INTERESTED_PRODUCT_PARENT);
        clickToElement(driver, INTERESTED_PRODUCT_PARENT);
        waitElementVisible(driver, INTERESTED_PRODUCT_ITEM, products);
        clickToElement(driver, INTERESTED_PRODUCT_ITEM, products);
    }

    public void clickToSubmitBtn() {
        waitElementClickable(driver, SUBMIT_BTN);
        clickToElement(driver, SUBMIT_BTN);
    }
}
