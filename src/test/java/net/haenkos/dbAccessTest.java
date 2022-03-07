package net.haenkos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.Objects;

public class dbAccessTest {
    @Test
    public void getAgent_notNullTest() throws Exception {
        DbAccess dbAccess = new DbAccess();

        Map<String, String> result = dbAccess.getAgent("007");

        assertNotNull(result.get("serNum"));
    }

    @Test
    public void getAgent_resultValueTest() throws Exception {
        DbAccess dbAccess = new DbAccess();

        Map<String, String> result = dbAccess.getAgent("007");

        assertTrue(Objects.equals(result.get("serNum"), "007"));
    }
}
