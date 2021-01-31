package interfaces;

public class RegisterPageUI {
    public static final String CONTINUE_BTN           = "//button[@type = 'submit']";
    public static final String DYNAMIC_TXTBX          = "//input[@name = '%s']";
    public static final String DYNAMIC_ERROR_TXT      = "//div[@name = '%s']/div/div[contains(@class, 'negative')]";
    public static final String ROLE_RADIO             = "//div[text() = '%s']/parent::div";
    public static final String WHERE_HEARD_DDL_PARENT = "//div[@data-cy = 'register-person-heard-about']";
    public static final String WHERE_HEARD_DDL_ITEMS  = "//div[@class = 'q-item__label']";
    public static final String TC_CHECKBX             = "//div[@data-cy = 'register-person-privacy']";
}
