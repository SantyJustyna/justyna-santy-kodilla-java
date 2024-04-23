package com.kodilla.good.patterns.challenges;

public class Messenger implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("Message to " + user + " has been sent.");
    }
}
