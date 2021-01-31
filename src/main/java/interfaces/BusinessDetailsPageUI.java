package interfaces;

public class BusinessDetailsPageUI {
    public static final String GET_STARTED_BTN          = "//button[@type = 'submit']";
    public static final String BUSINESS_NAME_TXTBX      = "//input[@data-cy = 'register-business-name']";
    public static final String REGISTRATION_TYPE_PARENT = "//input[@data-cy = 'register-business-registration-type']";
    public static final String DDL_ITEMS                = "//div[@class = 'q-item__label']";
    public static final String UEN_TXTBX                = "//input[@data-cy = 'register-business-registration-numer']";
    public static final String INDUSTRY_PARENT          = "//div[@data-cy = 'register-business-industry' and not" +
                                                          "(@label)]";
    public static final String SUB_INDUSTRY_PARENT      = "//div[@data-cy = 'register-business-sub-industry' and not" +
                                                          "(@label)]";
    public static final String SUBMIT_BTN               = "//button[@type= 'submit']";
}
