package net.haenkos;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for Dialog Class.
 */
public class ValidatorTest {
    @Test
    public void serNumVal_stringLengthTest_1() {
        IValidator validator = new Validator();

        assertTrue(validator.validateServiceNumber("1"));

    }

    @Test
    public void serNumVal_stringLengthTest_2() {
        IValidator validator = new Validator();

        assertTrue(validator.validateServiceNumber("40"));
    }

    @Test
    public void serNumVal_stringLengthTest_3() {
        IValidator validator = new Validator();

        assertTrue(validator.validateServiceNumber("007"));
    }

    @Test
    public void serNumVal_stringLengthTest_4() {
        IValidator validator = new Validator();

        assertFalse(validator.validateServiceNumber("0001"));
    }

    @Test
    public void serNumVal_stringLengthTest_5() {
        IValidator validator = new Validator();

        assertFalse(validator.validateServiceNumber(""));
    }

    @Test
    public void serNumVal_validRangeTest() {
        IValidator validator = new Validator();

        for (int i = 1; i <= 956; i++) {
            assertTrue(validator.validateServiceNumber(Integer.toString(i)));
        }
    }

    @Test
    public void serNumVal_invalidRangeTest() {
        IValidator validator = new Validator();

        assertFalse(validator.validateServiceNumber("0"));
        assertFalse(validator.validateServiceNumber("957"));
    }
}
