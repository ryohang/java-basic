package io.ascending.training.concurrency;

public class RaceCondition implements Runnable{

    private int c = 0;
    private Object mutex= new Object();

    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        c++;
    }

    public void decrement() {
        c--;
    }

    public int getValue() {
        return c;
    }

    @Override
    public void run() {
        synchronized(mutex) {
            //incrementing
            this.increment();
            System.out.println("Value for Thread After increment "
                    + Thread.currentThread().getName() + " " + this.getValue());
            //decrementing
            this.decrement();
            System.out.println("Value for Thread at last "
                    + Thread.currentThread().getName() + " " + this.getValue());
        }
    }

    public static void main(String[] args) {
        RaceCondition counter = new RaceCondition();
        Thread t1 = new Thread(counter, "Thread-1");
        Thread t2 = new Thread(counter, "Thread-2");
        Thread t3 = new Thread(counter, "Thread-3");
        t1.start();
        t2.start();
        t3.start();
    }
}
