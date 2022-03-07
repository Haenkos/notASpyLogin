package net.haenkos;

public class Controller implements IController {
    ILogger logger;
    IPrompter prompter;
    IDialog dialog;

    public Controller(IPrompter prompter, ILogger logger, IDialog dialog) {
        this.logger = logger;
        this.prompter = prompter;
        this.dialog = dialog;
    }

    @Override
    public void newLogin() throws EndProgramException {
        String serNum = prompter.promptServiceNumber();
        if(logger.isLoggedIn(serNum)) {
            dialog.alreadyLoggedInMessage();
        } else if (logger.isBlackListed(serNum)) {
            dialog.alreadyBlacklistedMessage();
        } else {
            if (prompter.promptPassphrase(serNum))
            {
                logger.logIn(serNum);
                dialog.welcomeAgentMessage(serNum);
            } else {
                logger.blackList(serNum);
                dialog.blackListedMessage();
            }
        }
    }

}
