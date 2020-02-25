package io.ascending.training.concurrency;

public class ThreadCountProcess implements Runnable{
    private int count;

    @Override
    public void run() {
        for(int i=1; i < 5; i++){
            processSomething(i);
            count++;
        }
    }

    public int getCount() {
        return this.count;
    }

    private void processSomething(int i) {
        // processing some job
        try {
            Thread.sleep(i*100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
