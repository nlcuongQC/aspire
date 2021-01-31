package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.WebDriver;

import static interfaces.BusinessDetailsPageUI.*;

public class BusinessDetailsPage extends AbstractPage {
    WebDriver driver;

    public BusinessDetailsPage(WebDriver driver) {
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

    public void inputToBusinessNameTxtbx(String value) {
        waitElementVisible(driver, BUSINESS_NAME_TXTBX);
        sendkeyToElement(driver, BUSINESS_NAME_TXTBX, value);
    }

    public void chooseRegistrationType(String type) {
        selectItemsInCustomDropdown(driver, REGISTRATION_TYPE_PARENT, DDL_ITEMS, type);
    }

    public void inputToUENTxtbx(String value) {
        waitElementVisible(driver, UEN_TXTBX);
        sendkeyToElement(driver, UEN_TXTBX, value);
    }

    public void chooseIndustry(String value) {
        selectItemsInCustomDropdown(driver, INDUSTRY_PARENT, DDL_ITEMS, value);
        waitElementsInvisible(driver, DDL_ITEMS);
    }

    public void chooseSubIndustry(String value) {
        selectItemsInCustomDropdown(driver, SUB_INDUSTRY_PARENT, DDL_ITEMS, value);
        waitElementsInvisible(driver, DDL_ITEMS);
    }

    public void clickToSubmitBtn() {
        waitElementClickable(driver, SUBMIT_BTN);
        clickToElement(driver, SUBMIT_BTN);
    }
}
