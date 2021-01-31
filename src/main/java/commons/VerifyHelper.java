package commons;

import org.junit.Assert;

public class VerifyHelper {

    public static VerifyHelper getVerify() {
        return new VerifyHelper();
    }

    private boolean checkTrue(boolean condition) {
        boolean pass = true;
        try {
            Assert.assertTrue(condition);
        } catch (Throwable e) {
            pass = false;
        }
        return pass;
    }

    public boolean verifyTrue(boolean condition) {
        return checkTrue(condition);
    }

    private boolean checkFalse(boolean condition) {
        boolean pass = true;
        try {
            Assert.assertFalse(condition);
        } catch (Throwable e) {
            pass = false;
        }
        return pass;
    }

    public boolean verifyFalse(boolean condition) {
        return checkFalse(condition);
    }

    private boolean checkEquals(Object actual, Object expected) {
        boolean pass = true;
        try {
            Assert.assertEquals(actual, expected);
        } catch (Throwable e) {
            pass = false;
        }
        return pass;
    }

    public boolean verifyEquals(Object actual, Object expected) {
        return checkEquals(actual, expected);
    }
}
