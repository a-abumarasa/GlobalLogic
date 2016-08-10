package tasks.third.observer;

import tasks.third.StockMarket;

/**
 *
 * a case of the observers with observe a specific caller, represents an investor who is interested in the market status  
 */
public class Investor implements MarketObserver {

    private int availableShares;
    private double sharePrice;
    private final StockMarket stockMarket;
    private final String name;

    public Investor(StockMarket stockMarket, String name) {
        this.stockMarket = stockMarket;
        this.name = name;
        this.stockMarket.register(this);
    }

    @Override
    public void update(int availableShares, double sharePrice) {
        this.availableShares = availableShares;
        this.sharePrice = sharePrice;
        System.out.println(String.format("%s reveived the market status. The shares quantity:%s, the price: %s",name, availableShares, sharePrice));
        /*
         do stuff
         e.g. if the price is good they may buy or sell some shares
         */
    }
}
