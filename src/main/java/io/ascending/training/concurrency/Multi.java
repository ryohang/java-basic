package io.ascending.training.concurrency;

public class Multi extends Thread {
    private Integer nThread;
    public Multi(Integer nThread){
        this.nThread=nThread;
    }
    public void run(){
        System.out.println("thread "+ nThread+" is running...");
        for (int i = 0; i < 3; i++) {
            System.out.println("thread Id:"+nThread);
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("[Interruption Responsive Thread] is interuptted");
                break;
            }
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread has been interrupted");
            }
        }
    };
    public static void main(String args[]){
        Multi t1= new Multi(1);
        Multi t2= new Multi(2);
        t1.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println("Thread names are following:");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println("Main completed!");
//        t1.stop();
//        t1.interrupt();
    };
}
