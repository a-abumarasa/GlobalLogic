package tasks.third.observer;

import tasks.third.StockMarket;

/**
 *
 * a case of the observers with observe a specific caller, represents a governmental organization 
 */
public class EconomyMinistry  implements MarketObserver {

    private int availableShares;
    private double sharePrice;
    private final StockMarket stockMarket;

    public EconomyMinistry(StockMarket stockMarket) {
        this.stockMarket = stockMarket;
        this.stockMarket.register(this);
    }

    @Override
    public void update(int availableShares, double sharePrice) {
        this.availableShares = availableShares;
        this.sharePrice = sharePrice;
        System.out.println(String.format("Log the market status Quantity%s, Price: %s", availableShares, sharePrice));
        /*
         do stuff
         e.g. monitoring and management the market from the government point of view :D 
         */
    }
    
}
