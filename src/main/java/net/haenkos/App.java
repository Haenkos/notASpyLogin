package net.haenkos;

/**
 * Definitely NOT a program for spies to log in to.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("\n*** Welcome to the definitely NOT a spy intranet ***\n");
        System.out.println("To exit program, type 'exit'\n");

        Controller controller = new Controller();

        try {
            while (true) {
                controller.newLogin();
            }
        } catch (EndProgramException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }
    }
}
