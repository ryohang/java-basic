package io.ascending.training.concurrency;

public class DeadLockThreadB implements Runnable {
    private Deadlock.Friend test1;
    private Deadlock.Friend test2;
    DeadLockThreadB(Deadlock.Friend test1, Deadlock.Friend test2){
        this.test1 = test1;
        this.test2 = test2;
    }
    @Override
    public void run() {
        synchronized(test2){
            System.out.println("" + test1.getName());
            synchronized(test1){
                System.out.println("Reached here");
            }
        }
    }
}
