package net.haenkos;

public class Validator {

    public boolean validateServiceNumber(String serNum) {
        try {
            if (Integer.parseInt(serNum) < 1 || Integer.parseInt(serNum) > 956) {
                return false;
            } else if (serNum.length() > 3) {
                return false;
            } else {
                return true;
            }
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean comparePassfrase(String passfrase) {
        if (passfrase.equals("For ThE Royal QUEEN")) {
            return true;
        } else {
            return false;
        }
    }
}
