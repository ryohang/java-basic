package io.ascending.training.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class RaceCondition implements Runnable{

    private AtomicInteger c = new AtomicInteger(0);
//    int c = 0;
    private Object mutex= new Object();
    private Object mutex1= new Object();
    private ReentrantLock counterLock = new ReentrantLock(true);
//    private ReentrantLock counterLock2 = new ReentrantLock(true);
    public void increment() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
//        counterLock.lock();
        c.getAndIncrement();
//        c++;
        System.out.println("Value for Thread After increment "
                + Thread.currentThread().getName() + " " + this.getValue());
    }

    public void decrement() {
        c.getAndDecrement();
//        c--;
        System.out.println("Value for Thread at last "
                + Thread.currentThread().getName() + " " + this.getValue());
//        counterLock.unlock();
    }

    public int getValue() {
        return c.intValue();
//        return c;
    }

    @Override
    public void run() {
//        if(counterLock.tryLock()){
//
//        }
//        System.out.println("i am queuing for lock");
//        counterLock.lock();
//        synchronized(mutex) {
            //incrementing
            this.increment();
            //decrementing
            this.decrement();

//        }
        //method 1
        //method 2
//        counterLock.unlock();
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
