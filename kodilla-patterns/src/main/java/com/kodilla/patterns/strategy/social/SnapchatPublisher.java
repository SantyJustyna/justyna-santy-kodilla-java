package com.kodilla.patterns.strategy.social;

public final class SnapchatPublisher implements SocialPublisher {
    @Override
    public String share() {
        return "(Snapchat publisher) choose Snapchat";
    }
}
