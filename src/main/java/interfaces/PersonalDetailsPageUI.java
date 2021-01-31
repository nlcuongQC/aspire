package interfaces;

public class PersonalDetailsPageUI {

    public static final String GET_STARTED_BTN           = "//button[@type = 'submit']";
    public static final String DATE_OF_BIRTH_TXTBX       = "//input[contains(@placeholder, 'date of birth')]";
    public static final String NATIONALITY_DDL_PARENT    = "//div[@label = 'Nationality']//div[@url]";
    public static final String DDL_ITEMS                 = "//div[@class = 'q-item__label']";
    public static final String GENDER_DDL_PARENT         = "//input[@data-cy = 'kyc-gender']";
    public static final String INTERESTED_PRODUCT_ITEM   = "//div[text() = '%s']/../..//input/parent::div";
    public static final String INTERESTED_PRODUCT_PARENT = "//div[@data-cy = 'person-edit-purposes' and contains" +
                                                           "(@label, 'products')]";
    public static final String SUBMIT_BTN                = "//button[@type = 'submit']";
    public static final String DATE_OF_BIRTH_YEAR_PARENT = "//span[@class = 'block' and text() = " +
                                                           "'2021']/ancestor::button";
    public static final String DATE_OF_BIRTH_BACK_BTN    = "//i[contains(@class, 'left')]/ancestor::div[@class = " +
                                                           "'col-auto']/button";
    public static final String DATE_OF_BIRTH_YEAR        = "//span[text() = '%s']/ancestor::button";
    public static final String DATE_OF_BIRTH_DAY         = "//span[text() = '%s']/ancestor::button";
}
