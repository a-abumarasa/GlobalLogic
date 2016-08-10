package tasks.second;
 
import java.util.Date;

/**
 *
 * Example of Singleton class example.
 * It represents a simple Logger which receives operations from workers to be logged.  
 * For thread safe Singleton I used static inner class which is initialized once after the first call 
 */
public class LogManager {
 
    private LogManager() {
    }

    private static class LoggerMangerHolder {
        private static final LogManager logManagerInstance = new LogManager();
    }

    public static LogManager getInstance() {
        return LoggerMangerHolder.logManagerInstance;
    }
     
    public synchronized void log(String operation){
        System.out.println(String.format("Thread: %s did: %s , at time: %s", Thread.currentThread().getId(),operation, new Date()));
    }

}
