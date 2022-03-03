package net.haenkos;

public interface IPrompter {
    String promptServiceNumber() throws EndProgramException;

    boolean promptPassphrase() throws EndProgramException;
}
