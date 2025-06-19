package UmaSirHomeTask;
class NumberPrinter {
    private int number = 1;
    private final int MAX = 100;

    // Odd number printing
    public synchronized void printOdd() {
        while (number <= MAX) {
            if (number % 2 == 0) {
                try {
                    wait();  // Wait until it's odd's turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Odd  : " + number);
                number++;
                notify();  // Notify even thread
            }
        }
    }

    // Even number printing
    public synchronized void printEven() {
        while (number <= MAX) {
            if (number % 2 == 1) {
                try {
                    wait();  // Wait until it's even's turn
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println("Even : " + number);
                number++;
                notify();  // Notify odd thread
            }
        }
    }
}

public class WaitNotifyExample{
    public static void main(String[] args) throws InterruptedException {
     long startTime=System.currentTimeMillis();

        final NumberPrinter printer = new NumberPrinter();

        // Thread for printing odd numbers
        Thread oddThread = new Thread(new Runnable() {
            public void run() {
                printer.printOdd();
            }
        });

        // Thread for printing even numbers
        Thread evenThread = new Thread(new Runnable() {
            public void run() {
                printer.printEven();
            }
        });

        oddThread.start();
        evenThread.start();

        oddThread.join();
        evenThread.join();

        System.out.print(System.currentTimeMillis()-startTime);

    }
}
