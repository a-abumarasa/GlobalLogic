package tasks.third;

import java.util.ArrayList; 
import tasks.third.command.Operation;

/**
 *
 * this is a collector and executer for the market operation.
 * it gets the operation by callback operation objects
 */
public class StockMarketController {

    private final ArrayList<Operation> OperationsList ;
    
    public StockMarketController(){
        OperationsList = new ArrayList<>();
    }
    
    public void signOperation(Operation operation) {
        OperationsList.add(operation);
    }

    public void workOffOperations() {
        OperationsList.stream().forEach((operation) -> {
            operation.execute();
        });
        OperationsList.clear();
    }
}
