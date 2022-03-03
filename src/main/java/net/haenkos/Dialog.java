package net.haenkos;

import javax.swing.*;

public class Dialog implements IDialog {
    JFrame frame = new JFrame();

    @Override
    public String serviceNumberDialog() {
        return JOptionPane.showInputDialog(frame, "Please give your service Number", "Not A Spy Login", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public String passphraseDialog() {
        return JOptionPane.showInputDialog(frame, "Please type in the passphrase", "Not A Spy Login", JOptionPane.QUESTION_MESSAGE);
    }

    @Override
    public void blackListedMessage() {
        JOptionPane.showMessageDialog(frame, "Alarm has been raised. Please remain where you are, security forces are en route for pickup.");
        JOptionPane.showMessageDialog(frame, "Also you are now blacklisted.");
    }

    @Override
    public void alreadyBlacklistedMessage() {
        JOptionPane.showMessageDialog(frame, "You've tried this once already, we are not falling for it!");
        JOptionPane.showMessageDialog(frame, "(You are blacklisted, if you didn't understand.)");
    }

    @Override
    public void alreadyLoggedInMessage() {
        JOptionPane.showMessageDialog(frame, "You are already logged in.");
    }

    @Override
    public void welcomeAgentMessage(String serNum) {
        JOptionPane.showMessageDialog(frame, "Welcome, agent " + serNum);
    }

    @Override
    public void whoIsThisDialog() {
        JOptionPane.showMessageDialog(frame, "Invalid service number. Who is this?");
    }

    @Override
    public void welcomeSplash() {
        JOptionPane.showMessageDialog(frame, "Welcome to definitely Not A Spy Login.");
    }
}
