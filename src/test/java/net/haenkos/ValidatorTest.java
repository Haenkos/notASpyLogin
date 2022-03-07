package net.haenkos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Dialog Class.
 */
public class ValidatorTest {
    @Test
    public void serNumVal_stringLengthTest_1() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertTrue(validator.validateServiceNumber("1"));

    }

    @Test
    public void serNumVal_stringLengthTest_2() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertTrue(validator.validateServiceNumber("40"));
    }

    @Test
    public void serNumVal_stringLengthTest_3() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertTrue(validator.validateServiceNumber("007"));
    }

    @Test
    public void serNumVal_stringLengthTest_4() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertFalse(validator.validateServiceNumber("0001"));
    }

    @Test
    public void serNumVal_stringLengthTest_5() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertFalse(validator.validateServiceNumber(""));
    }

    @Test
    public void serNumVal_validRangeTest() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        for (int i = 1; i <= 956; i++) {
            assertTrue(validator.validateServiceNumber(Integer.toString(i)));
        }
    }

    @Test
    public void serNumVal_invalidRangeTest() {
        IDbAccess testAccess = new Test_DbAccess();
        IValidator validator = new Validator(testAccess);

        assertFalse(validator.validateServiceNumber("0"));
        assertFalse(validator.validateServiceNumber("957"));
    }
}
