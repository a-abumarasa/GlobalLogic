package tasks.third.command;

import tasks.third.StockMarket;

/**
 *
 * command to sell a specific amount of shares
 */
public class SellOperation implements Operation{
    private final StockMarket stockMarket;
    private final int amount;
    public  SellOperation(StockMarket stockMarket,int amount){
        this.stockMarket = stockMarket;
        this.amount = amount;
    }

    @Override
    public void execute() {
        stockMarket.sellShares(amount);
    }
    
}
