package tasks.second;

/**
 *
 * Demo for running multithreading using multi operator 
 */
public class OperatorDemo {

    public static void main(String[] args) {
        Operator[] threads = new Operator[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Operator();
        }
        for (Operator thread : threads) {
            thread.start();
        }
    }
}
