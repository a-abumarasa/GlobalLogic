package tasks.third;

import tasks.third.observer.MarketObserver;
import java.util.ArrayList;

/**
 *
 * this is the stock market which has mot of the operations on the shares. 
 * it buys, sell or set the price of the shares
 * in the same time it supports all its observer with the market information whenever it gets changed
 */
public class StockMarket implements Subject{
    private final  ArrayList<MarketObserver> observers;
    
    private int availableShares ;
    private double sharePrice ;
    
    public  StockMarket(){
        observers = new ArrayList<>();
    }
    
    @Override
    public void register(MarketObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(MarketObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.stream().forEach((observer) -> {
            observer.update(availableShares,sharePrice);
        });
    }

    public void sellShares(int amount) {
        availableShares -= amount;
        notifyObservers();
    }

    public void buyShares(int amount) {
        availableShares += amount;
        notifyObservers();
    }
        
    public void setSharePrice(double sharePrice) {
        this.sharePrice = sharePrice;
        notifyObservers();
    }   
}
