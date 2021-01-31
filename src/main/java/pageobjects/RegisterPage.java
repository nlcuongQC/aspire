package pageobjects;

import commons.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import static interfaces.RegisterPageUI.*;

public class RegisterPage extends AbstractPage {
    WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public boolean isAt() {
        waitElementVisible(driver, CONTINUE_BTN);
        return isElementDisplayed(driver, CONTINUE_BTN);
    }

    public boolean isContinueBtnDisabled() {
        waitElementVisible(driver, CONTINUE_BTN);
        return getElementAttribute(driver, CONTINUE_BTN, "disabled").equals("disabled");
    }

    public RegisterPage inputToDynamicTxtbx(String txtbxName, String value) {
        waitElementVisible(driver, DYNAMIC_TXTBX, txtbxName);
        sendkeyToElement(driver, DYNAMIC_TXTBX, value, txtbxName);
        sendKeyboardToElement(driver, DYNAMIC_TXTBX, Keys.TAB, txtbxName);
        return this;
    }

    public String getDynamicErrorTxt(String txtbxName) {
        waitElementVisible(driver, DYNAMIC_ERROR_TXT, txtbxName);
        return getElementText(driver, DYNAMIC_ERROR_TXT, txtbxName);
    }

    public RegisterPage chooseRoleRadioBtn(String role) {
        waitElementClickable(driver, ROLE_RADIO, role);
        clickToElementByJS(driver, ROLE_RADIO, role);
        return this;
    }

    public RegisterPage chooseWhereHeardDDL(String whereHeard) {
        selectItemsInCustomDropdown(driver, WHERE_HEARD_DDL_PARENT, WHERE_HEARD_DDL_ITEMS, whereHeard);
        return this;
    }

    public void checkTCcheckbx() {
        waitElementClickable(driver, TC_CHECKBX);
        clickToElementByJS(driver, TC_CHECKBX);
    }

    public void clickToContinueBtn() {
        waitElementClickable(driver, CONTINUE_BTN);
        clickToElement(driver, CONTINUE_BTN);
    }
}
