package io.ascending.training.concurrency;

public class Display implements Runnable {
    private ThreadStarveDemo td;
    Display(ThreadStarveDemo td){
        this.td = td;
    }
    @Override
    public void run() {
        td.displayValues();
        System.out.println("Calling again");
        td.displayValues();
        System.out.println("Calling again");
        td.displayValues();
        //System.out.println("Calling again");
    }
}
