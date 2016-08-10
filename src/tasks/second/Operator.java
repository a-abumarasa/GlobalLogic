package tasks.second;

/**
 *
 * Operator class represents a user of the singleton instance with
 * separated thread 
 */
public class Operator implements Runnable {

    private final Thread thread;

    public Operator() {
        thread = new Thread(this);
    }

    public void start() {
        thread.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            //do stuff
            LogManager.getInstance().log("Action " + i);
        }
    }
}
