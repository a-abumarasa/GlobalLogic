package tasks.third.command;

import tasks.third.StockMarket;

/**
 *
 * command to set the price of the shares
 */
public class SetPriceOperation  implements Operation{
    private final StockMarket stockMarket;
    private final double price;
    public  SetPriceOperation(StockMarket stockMarket,double price){
        this.stockMarket = stockMarket;
        this.price = price;
    }

    @Override
    public void execute() {
        stockMarket.setSharePrice(price);
    }
    
}
