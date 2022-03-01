package net.haenkos;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Prompter {
    private Validator validator;
    private Scanner prompt;

    Prompter(/* JH TIP: Gebruik dependency injection om de validator erin te zetten, dat maakt het testen straks makkelijker */) {
        validator = new Validator();
        prompt = new Scanner(System.in); /* JH: Let op Scanner is een resource, je zou dus prompt.Close() moeten aanroepen bij het einde van je programma, nu is het een resource leak */
    }

    public String promptServiceNumber() throws EndProgramException {
        boolean valid;
        String serNumInput;

        System.out.print("Please enter your service number: ");

        do {
            serNumInput = prompt.nextLine();

            if (serNumInput.equals("exit")) {
                throw new EndProgramException("Goodbye!");
            }

            valid = validator.validateServiceNumber(serNumInput);

            if (!valid) {
                System.out.print("Invalid service Number, who is this? ");
            }

        } while (!valid);

        return formatSerNum(serNumInput);
    }

    public boolean promptPassfrase() {
        System.out.print("Please enter passfrase: ");
        String passfraseInput = prompt.nextLine();

        return validator.comparePassfrase(passfraseInput);
    }


    private String formatSerNum(String serNum) {
        return StringUtils.leftPad(serNum, 3, "0"); /* JH TIP: Je heb dit nu met een externe library (apache.commons) opgelost, 
                                                               maar je kunt het ook met plain java oplossen met de format functie
                                                               https://www.javatpoint.com/java-string-format */
    }
}
