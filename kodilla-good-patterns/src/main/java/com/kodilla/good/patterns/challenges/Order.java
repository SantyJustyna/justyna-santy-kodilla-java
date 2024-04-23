package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Order {
    private User user;
    private Item item;
    private int orderNumber;
    LocalDate purchasingDate;
    LocalDate deliveryDate;

    public Order(final User user, final Item item, final int orderNumber, final LocalDate purchasingDate, final LocalDate deliveryDate) {
        this.user = user;
        this.item = item;
        this.purchasingDate = purchasingDate;
        this.deliveryDate = deliveryDate;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public LocalDate getPurchasingDate() {
        return purchasingDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

}
