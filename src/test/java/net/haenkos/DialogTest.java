package net.haenkos;

import org.junit.Test;

import static org.junit.Assert.*;

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
        assertNotNull(dialog.serviceNumberDialog());
    }

    @Test
    public void blacklistDialogTester() {
        Dialog dialog = new Dialog();

        dialog.blackListedMessage();
    }

}
