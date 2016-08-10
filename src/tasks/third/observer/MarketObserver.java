package tasks.third.observer;

/**
 *
 * represents the type of observer
 */
public interface MarketObserver {     
    public void update(int availableShares,double sharePrice );
}
