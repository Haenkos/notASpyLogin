package net.haenkos;

import java.util.Map;
import java.util.HashMap;

public interface IDbAccess {
    HashMap<String, String> getAgent(String serNum) throws Exception;

    void updateBlacklist(String serNum);
}
