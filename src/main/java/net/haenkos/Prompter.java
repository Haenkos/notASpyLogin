package net.haenkos;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Prompter {
    private Validator validator;
    private Scanner prompt;

    Prompter() {
        validator = new Validator();
        prompt = new Scanner(System.in);
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
        return StringUtils.leftPad(serNum, 3, "0");
    }
}
