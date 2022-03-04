package net.haenkos;

public class Test_DbAccess implements IDbAccess {
    @Override
    public String[] getAgent(String serNum) throws AgentNotFoundException {
        return new String[0];
    }

    @Override
    public void updateBlacklist(String serNum) {

    }
}
