package net.haenkos;

public interface IPrompter {
    String promptServiceNumber() throws EndProgramException;

    boolean promptPassphrase(String serNum) throws EndProgramException;
}
