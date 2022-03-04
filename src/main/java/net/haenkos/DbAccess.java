package net.haenkos;

public class DbAccess implements IDbAccess {

    @Override
    public String[] getAgent(String serNum) throws AgentNotFoundException {

        try {
            //access database and get agent
        } catch (Exception e) {
            throw new AgentNotFoundException("Agent does not exist in database");
        }

        return new String[0];
    }

    @Override
    public void updateBlacklist(String serNum) {

    }
}
