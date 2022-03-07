package net.haenkos;

import java.util.HashMap;
import java.util.Map;

public class Validator implements IValidator {
    IDbAccess dbAccess;

    public Validator (IDbAccess dbAccess) {
        this.dbAccess = dbAccess;
    }
    @Override
    public boolean validateServiceNumber(String serNum) {
        try {
            dbAccess.getAgent(serNum);
            return true;
        } 
        catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean comparePassphrase(String passphrase, String serNum) {
        HashMap<String,String> agent = null;
        try {
        agent = dbAccess.getAgent("serNum");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return serNum.equals(agent.get(passphrase));
    }
}
