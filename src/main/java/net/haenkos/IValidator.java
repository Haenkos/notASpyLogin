package net.haenkos;

public interface IValidator {
    boolean validateServiceNumber(String serNum);

    boolean comparePassphrase(String passphrase);
}
