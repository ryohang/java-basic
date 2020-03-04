package io.ascending.training.concurrency;

public class AnotherDisplay implements Runnable {
    private ThreadStarveDemo td;
    AnotherDisplay(ThreadStarveDemo td){
        this.td = td;
    }
    @Override
    public void run() {
        try {
            // introducing some delay
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        td.displayValues();
        //System.out.println("Calling again");
    }
}
