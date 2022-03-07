package net.haenkos;

import java.util.HashMap;
import java.util.Map;

public class Test_DbAccess implements IDbAccess {
    @Override
    public HashMap<String, String> getAgent(String serNum) throws AgentNotFoundException {
        HashMap<String,String> testResult = new HashMap<>();

        testResult.put("serNum", "001");
        testResult.put("passphrase", "For ThE Royal QUEEN");
        testResult.put("blacklisted", "0");

        return testResult;
    }

    @Override
    public void updateBlacklist(String serNum) {

    }
}
