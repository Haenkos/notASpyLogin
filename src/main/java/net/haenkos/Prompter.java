package net.haenkos;

import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;

public class Prompter implements IPrompter {
    private final IValidator validator;
    private final IDialog dialog;

    public Prompter(IValidator validator, IDialog dialog) {
        this.validator = validator;
        this.dialog = dialog;
    }

    @Override
    public String promptServiceNumber() throws EndProgramException {
        boolean valid;
        String serNumInput;

        do {
            serNumInput = dialog.serviceNumberDialog();

            if (serNumInput.equals("exit")) {
                throw new EndProgramException("Goodbye!");
            }

            valid = validator.validateServiceNumber(serNumInput);

            if (!valid) {
                dialog.whoIsThisDialog();
            }

        } while (!valid);

        return formatSerNum(serNumInput);
    }

    @Override
    public boolean promptPassphrase() {
        return validator.comparePassphrase(dialog.passphraseDialog());
    }


    private String formatSerNum(String serNum) {
        return StringUtils.leftPad(serNum, 3, "0");
    }
}
