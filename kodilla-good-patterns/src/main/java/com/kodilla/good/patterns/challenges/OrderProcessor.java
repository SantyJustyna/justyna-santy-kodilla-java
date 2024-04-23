package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OrderProcessor {
    public Order process() {
        User user = new User("Ola", "Kowlaska");
        Item item = new Item("Czerwony szalik", 1);
        int orderNumber = 21233;

        LocalDate purchasingDate = LocalDate.of(2024, 5, 2);
        LocalDate deliveryDate = LocalDate.of(2024, 5, 6);

        return new Order(user, item, orderNumber, purchasingDate, deliveryDate);

    }
}
