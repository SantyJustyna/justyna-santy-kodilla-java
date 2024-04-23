package com.kodilla.good.patterns.challenges;

public class TradingDto {
    private User user;
    private boolean sold;

    public TradingDto(final User user, final boolean sold) {
        this.user = user;
        this.sold = sold;
    }

    public User getUser() {
        return user;
    }

    public boolean isSold() {
        return sold;
    }
}
