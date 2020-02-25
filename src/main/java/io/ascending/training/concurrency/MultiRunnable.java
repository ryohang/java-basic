package io.ascending.training.concurrency;

public class MultiRunnable implements Runnable {
    private Integer nThread;
    public MultiRunnable(Integer nThread){
        this.nThread=nThread;
    }
    public static void main(String args[]){
        MultiRunnable r1= new MultiRunnable(1);
        MultiRunnable r2= new MultiRunnable(2);

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    };

    @Override
    public void run() {
        System.out.println("thread "+ nThread+" is running...");
        System.out.println("running thread priority is:"+Thread.currentThread().getPriority());
    }
}
