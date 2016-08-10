For the third task:
*The example represents a stock market which controls some shares (quantity and price)
*To use the listener/observer design pattern I represented the stock market as notifier(subject) 
and represented any on interested in the market as observer (here are two examples of the observer: Investors and Ministry of economic)
*To use the command design pattern I made three operations to be executed over the stock market: buy, sell set the price operations

*The system works as follow:
    - The stock market is first initialized (can be initialized with specific quantity of shares and price, but I left it simple).
    - A group of market observers are getting initialized, and get ready to listen to the market changes.
    - Prepare a group of command to be executed on the stock market.
    - execute the list of operation
    - after the stock market makes any change, it notify all its observer with these changes
    - the observer get the new information from the market (the new price and quantity of the shares)
    - each observer deal with the new information with its own way (I left if just printing out to keep it simple)

 
