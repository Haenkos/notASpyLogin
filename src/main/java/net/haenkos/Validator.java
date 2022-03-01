package net.haenkos;

public class Validator /* JH TIP: Deze classname is erg generiek, noem hem MI6Validator of InputValidator of zoiets */ {

    public boolean validateServiceNumber(String serNum) {
        try {
            if (Integer.parseInt(serNum) < 1 || Integer.parseInt(serNum) > 956) { /* JH: Je doet de Integer.parseInt 2x, je kan het beter 1x doen en in een variabele zetten */
                return false;
            } else if (serNum.length() > 3) { /* JH: Ik zou deze if eerst doen */
                return false;
            } else { /* JH TIP: Omdat alle code paden hiervoor een return hebben, is deze else niet nodig */
                return true;
            }
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean comparePassfrase(String passfrase) {
        if (passfrase.equals("For ThE Royal QUEEN")) { /* JH: Deze code faalt als passfrase NULL is, dit kan je omzeilen door te zeggen if ("For ThE Royal QUEEN".equals(passfrase)) */ /* JH TIP: Je kan dit korter opschrijven door te zeggen return passfrase.equals("For ThE Royal QUEEN"); */ 
            return true;
        } else {
            return false;
        }
    }
}
