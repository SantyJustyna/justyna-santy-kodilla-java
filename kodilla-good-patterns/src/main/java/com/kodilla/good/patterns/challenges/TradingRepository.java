package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.time.LocalDateTime;

public interface TradingRepository {
    void createOrder(User user, int orderNumber);

}
