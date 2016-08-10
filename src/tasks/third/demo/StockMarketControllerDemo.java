package tasks.third.demo;

import tasks.third.StockMarket;
import tasks.third.StockMarketController;
import tasks.third.observer.EconomyMinistry;
import tasks.third.observer.Investor;
import tasks.third.command.BuyOperation;
import tasks.third.command.SellOperation;
import tasks.third.command.SetPriceOperation;

/**
 *
 * This is a demo of the work flow.
 * here you'll find one object of the stock market called warsawStockMarket
 * three observers for warsawStockMarket: ahmed, sara and ministryOfEconomy
 * one controller of the stock market witch takes command and then executes them, it's called warsawMarketController
 * four example of the market operations: buy, sell and set price
 */
public class StockMarketControllerDemo {

    public static void main(String[] args) {
        
        StockMarket warsawStockMarket = new StockMarket();
        Investor ahmed = new Investor(warsawStockMarket, "Ahmed");
        Investor sara = new Investor(warsawStockMarket, "Sara");
        EconomyMinistry ministryOfEconomy = new EconomyMinistry(warsawStockMarket);

        StockMarketController warsawMarketController = new StockMarketController();
        warsawMarketController.signOperation(new SetPriceOperation(warsawStockMarket, 15.5));
        warsawMarketController.signOperation(new BuyOperation(warsawStockMarket, 5));
        warsawMarketController.signOperation(new BuyOperation(warsawStockMarket, 15));
        warsawMarketController.signOperation(new SellOperation(warsawStockMarket, 7));        
        
        warsawMarketController.workOffOperations();
    }
}
