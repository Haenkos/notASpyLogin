package net.haenkos;

public class Controller {
    Logger logger;
    Prompter prompter;

    /* JH TIP: Maak methoden (dus ook de constructor) 'public' of 'private' maar laat het niet weg */ Controller(/* JH TIP: Maak van de logger en de prompter een 'interface', en geef deze mee aan de constructor voor dependency injectie */) {
        logger = new Logger();
        prompter = new Prompter();
    }

    public void newLogin() throws EndProgramException {
        String serNum = prompter.promptServiceNumber();
        if(logger.isLoggedIn(serNum)) {
            System.out.println("already logged in. A good memory is essential for a spy.\n"); /* JH TIP: Maak hiervoor kleine functie in de Prompter of een Displayer class */
        } else if (logger.isBlackListed(serNum)) {
            System.out.println("You've tried this once. We are not falling for it: you are on the blacklist!\n"); /* JH TIP: Maak hiervoor kleine functie in de Prompter of een Displayer class */
        } else {
            if (prompter.promptPassfrase())
            {
                logger.logIn(serNum);
                System.out.printf("Welcome agent %s!\n\n", serNum); /* JH TIP: Maak hiervoor kleine functie in de Prompter of een Displayer class */
            } else {
                logger.blackList(serNum);
                System.out.println("Alarm has been raised. Please remain where you are, security forces are en route for pickup.\n"); /* JH TIP: Maak hiervoor kleine functie in de Prompter of een Displayer class */
                System.out.println("Also you are now blacklisted!\n"); 
            }
        }
    }

}
