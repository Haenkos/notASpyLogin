package net.haenkos;

import java.util.ArrayList;

public class Logger implements ILogger {
    private final ArrayList<String> loggedIn = new ArrayList<>();
    private final ArrayList<String> blackListed = new ArrayList<>();

    @Override
    public boolean isLoggedIn(String serNum)
    {
        return loggedIn.contains(serNum);
    }

    @Override
    public boolean isBlackListed(String serNum)
    {
        return blackListed.contains(serNum);
    }

    @Override
    public void logIn(String serNum)
    {
        loggedIn.add(serNum);
    }

    @Override
    public void blackList(String serNum)
    {
        blackListed.add(serNum);
    }
}
