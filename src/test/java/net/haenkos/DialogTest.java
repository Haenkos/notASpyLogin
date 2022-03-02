package net.haenkos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
/**
 * Unit test for Dialog Class.
 */
public class DialogTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void serNumDialogTester ()
    {
        Dialog dialog = new Dialog();
        assertEquals("placeholderMessage", dialog.serviceNumberDialog());
    }

}
