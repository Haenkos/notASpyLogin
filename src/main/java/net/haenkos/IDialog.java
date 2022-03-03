package net.haenkos;

public interface IDialog {
    String serviceNumberDialog();

    String passphraseDialog();

    void blackListedMessage();

    void alreadyBlacklistedMessage();

    void alreadyLoggedInMessage();

    void welcomeAgentMessage(String serNum);

    void whoIsThisDialog();

    void welcomeSplash();
}