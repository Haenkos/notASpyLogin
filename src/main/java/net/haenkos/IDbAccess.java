package net.haenkos;

public interface IDbAccess {
    String[] getAgent(String serNum) throws AgentNotFoundException;

    void updateBlacklist(String serNum);
}
