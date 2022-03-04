package net.haenkos;

public class AgentNotFoundException extends Exception {
    public AgentNotFoundException(String errorMessage) {
        super(errorMessage);
    }
}
