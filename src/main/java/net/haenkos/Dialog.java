package net.haenkos;

public class Dialog implements IDialog {

    @Override
    public String serviceNumberDialog() {
        System.out.println("placeholderMessage");
        return "placeholderMessage";
    }

    @Override
    public String passphraseDialog() {
        System.out.println("placeholderMessage");
        return "placeholderMessage";
    }

    @Override
    public void blackListedMessage() {
        System.out.println("placeholderMessage");
    }

    @Override
    public void alreadyBlacklistedMessage() {
        System.out.println("placeholderMessage");
    }

    @Override
    public void alreadyLoggedInMessage() {
        System.out.println("placeholderMessage");
    }

    @Override
    public void welcomeAgentMessage(String serNum) {
        System.out.println("placeholderMessage");
    }

    @Override
    public void whoIsThisDialog() {
        System.out.println("placeholderMessage");
    }
}
