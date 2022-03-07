package net.haenkos;

import java.util.HashMap;
import java.util.Map;
/**
 * Definitely NOT a program for spies to log in to.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IDbAccess dbAccess = new DbAccess();
        IValidator validator = new Validator(dbAccess);
        IDialog dialog = new Dialog();
        IPrompter prompter = new Prompter(validator, dialog);
        ILogger logger = new Logger();
        IController controller = new Controller(prompter, logger, dialog);

        dialog.welcomeSplash();

        try {
            //noinspection InfiniteLoopStatement
            while (true) {
                controller.newLogin();
            }
        } catch (EndProgramException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }

    }
}

        /*
        IDbAccess dbAccess = new DbAccess();
        IValidator validator = new Validator(dbAccess);
        IDialog dialog = new Dialog();
        IPrompter prompter = new Prompter(validator, dialog);
        ILogger logger = new Logger();
        IController controller = new Controller(prompter, logger, dialog);

        dialog.welcomeSplash();

        try {
            //noinspection InfiniteLoopStatement
            while (true) {
                controller.newLogin();
            }
        } catch (EndProgramException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
        */

        /*
        IDbAccess dbAccess = new DbAccess();

        try {
        Map<String,String> result = dbAccess.getAgent("007");

        System.out.println("From main function: " + result.get("serNum"));
        System.out.println("From main function: " + result.get("passphrase"));
        System.out.println("From main function: " + result.get("blacklisted"));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
