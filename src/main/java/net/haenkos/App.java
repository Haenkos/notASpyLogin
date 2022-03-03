package net.haenkos;

/**
 * Definitely NOT a program for spies to log in to.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        IDialog dialog = new Dialog();
        IValidator validator = new Validator();
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
