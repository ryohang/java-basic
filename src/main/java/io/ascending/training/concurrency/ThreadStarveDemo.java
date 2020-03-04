package io.ascending.training.concurrency;

public class ThreadStarveDemo {

    synchronized void displayValues(){
        System.out.println("In ThreadStarveDemo For thread " +
                Thread.currentThread().getName());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("For thread " + Thread.currentThread().getName());
        for(int i = 0; i < 3; i++){
            System.out.println("Value of i " + i);
        }
    }

    public static void main(String[] args) {
        ThreadStarveDemo td1 = new ThreadStarveDemo();
        // Creating 3 threads
        Thread thread0 = new Thread(new AnotherDisplay(td1));
        Thread thread1 = new Thread(new Display(td1));
        Thread thread2 = new Thread(new Display(td1));

        // Setting priorities
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread0.setPriority(Thread.MIN_PRIORITY);

        thread0.start();
        thread1.start();
        thread2.start();

    }
}
