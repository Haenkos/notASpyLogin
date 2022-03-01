package net.haenkos;

public class Controller {
    Logger logger;
    Prompter prompter;

    Controller() {
        logger = new Logger();
        prompter = new Prompter();
    }

    public void newLogin() throws EndProgramException {
        String serNum = prompter.promptServiceNumber();
        if(logger.isLoggedIn(serNum)) {
            System.out.println("already logged in. A good memory is essential for a spy.\n");
        } else if (logger.isBlackListed(serNum)) {
            System.out.println("You've tried this once. We are not falling for it: you are on the blacklist!\n");
        } else {
            if (prompter.promptPassfrase())
            {
                logger.logIn(serNum);
                System.out.printf("Welcome agent %s!\n\n", serNum);
            } else {
                logger.blackList(serNum);
                System.out.println("Alarm has been raised. Please remain where you are, security forces are en route for pickup.\n");
                System.out.println("Also you are now blacklisted!\n");
            }
        }
    }

}
