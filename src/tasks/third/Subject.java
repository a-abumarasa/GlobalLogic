package tasks.third;

import tasks.third.observer.MarketObserver;

/**
 *
 * The subject class of the observer design pattern 
 */
public interface Subject {
    public void register(MarketObserver observer);
    public void unregister(MarketObserver observer);
    public void notifyObservers();
}
