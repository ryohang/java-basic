package io.ascending.training.concurrency;

public class Deadlock {
    static class Friend {
        private final String name;
        public Friend(String name) {
            this.name = name;
        }
        public String getName() {
            return this.name;
        }
        public void  bow(Friend bower) {
            synchronized (bower){
                System.out.format("%s: %s"
                                + "  has bowed to me!%n",
                        this.name, bower.getName());
                bower.bowBack(this);
            }

        }
        public void bowBack(Friend bower) {
            System.out.format("%s: %s"
                            + " has bowed back to me!%n",
                    this.name, bower.getName());
        }
    }

    public static void main(String[] args) {
        final Friend alphonse =
                new Friend("Alphonse");
        final Friend gaston =
                new Friend("Gaston");
        new Thread(new Runnable() {
            public void run() { alphonse.bow(gaston); }
        }).start();
        new Thread(new Runnable() {
            public void run() { gaston.bow(alphonse); }
        }).start();
//        Friend test1 = new Friend("Test-1");
//        Friend test2 = new Friend("Test-2");
//        Thread t1 = new Thread(new DeadLockThreadA(test1, test2));
//        Thread t2 = new Thread(new DeadLockThreadB(test1, test2));
//        t1.start();
//        t2.start();
    }
}
