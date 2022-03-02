package net.haenkos;

public interface ILogger {
    boolean isLoggedIn(String serNum);

    boolean isBlackListed(String serNum);

    void logIn(String serNum);

    void blackList(String serNum);
}
