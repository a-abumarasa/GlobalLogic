package tasks.third.command;

import tasks.third.StockMarket;

/**
 *
 * command to buy specific amount of shares 
 */
public class BuyOperation implements Operation{
    private final StockMarket stockMarket;
    private final int amount;
    public  BuyOperation(StockMarket stockMarket,int amount){
        this.stockMarket = stockMarket;
        this.amount = amount;
    }

    @Override
    public void execute() {
        stockMarket.buyShares(amount);
    }
    
}
