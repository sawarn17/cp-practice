package multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class OddEvenPrint {

    public static final int MAX_COUNT = 10;
    private static AtomicInteger count = new AtomicInteger(1);
    private static final Object lock = new Object();

    public static void main(String[] args) {
        Thread oddThread = new Thread(new OddPrinter(), "OddThread");
        Thread evenThread = new Thread(new EvenPrinter(), "EvenThread");

        oddThread.start();
        evenThread.start();
    }

    static class OddPrinter implements Runnable {
        @Override
        public void run() {
            while (count.get() <= MAX_COUNT) {
                synchronized (lock) {
                    if (count.get() % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count.getAndIncrement());
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

    static class EvenPrinter implements Runnable {
        @Override
        public void run() {
            while (count.get() <= MAX_COUNT) {
                synchronized (lock) {
                    if (count.get() % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + count.getAndIncrement());
                        lock.notify();
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
