package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private InformationService informationService;
    private TradingService tradingService;
    private TradingRepository tradingRepository;
    public ProductOrderService(final InformationService informationService,
                           final TradingService tradingService,
                           final TradingRepository tradingRepository) {
        this.informationService = informationService;
        this.tradingService = tradingService;
        this.tradingRepository = tradingRepository;
    }
    public TradingDto process(final Order order) {
        boolean sold = tradingService.sell(order.getUser(), order.getItem());
        if (sold) {
            informationService.inform(order.getUser());
            tradingRepository.createOrder(order.getUser(), order.getOrderNumber());
            return new TradingDto(order.getUser(), true);
        } else {
            return new TradingDto(order.getUser(), false);
        }
    }
}
