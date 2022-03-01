package net.haenkos;

import java.util.ArrayList;

public class Logger {
    private ArrayList<String> loggedIn = new ArrayList<String>();
    private ArrayList<String> blackListed = new ArrayList<String>();

    public boolean isLoggedIn(String serNum)
    {
        return loggedIn.contains(serNum);
    }

    public boolean isBlackListed(String serNum)
    {
        return blackListed.contains(serNum);
    }

    public void logIn(String serNum)
    {
        loggedIn.add(serNum);
    }

    public void blackList(String serNum)
    {
        blackListed.add(serNum);
    }
}
