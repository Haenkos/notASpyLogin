package net.haenkos;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.*;

public class PrompterTest {
    @Test
    public void promptSerNumTest() throws EndProgramException {
        Dialog dialog = new Dialog();
        Validator validator = new Validator();
        Prompter prompter = new Prompter(validator, dialog);

        Pattern pattern = Pattern.compile("\\d\\d\\d");
        Matcher matcher = pattern.matcher(prompter.promptServiceNumber());

        assertTrue(matcher.find());
    }
}
