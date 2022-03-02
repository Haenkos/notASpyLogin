package net.haenkos;

public class Validator implements IValidator {

    @Override
    public boolean validateServiceNumber(String serNum) {
        try {
            if (Integer.parseInt(serNum) < 1 || Integer.parseInt(serNum) > 956) {
                return false;
            } else return serNum.length() <= 3;
        } 
        catch (NumberFormatException e) {
            return false;
        }
    }

    @Override
    public boolean comparePassphrase(String passphrase) {
        return passphrase.equals("For ThE Royal QUEEN");
    }
}
