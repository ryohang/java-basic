package io.ascending.training.concurrency;

public class TestVolatile {
    //volatile
    private static boolean flag = false;
    public static void main(String[] args) {
        // implemented as anonymous inner class
        new Thread(new Runnable(){

            @Override
            public void run() {
                for (int i = 1; i <= 5000; i++){
                    System.out.println("printing value " + i);
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                flag = true;
            }

        }).start();

//        // Implemented as lambda expression
        new Thread(()-> {
            int i = 1;
            while (!flag) i++;
            System.out.println("Job Done " + i);
        }).start();
//        Shared shared = new Shared();
//        shared.var1="5";
//        shared.var2="5";
////        new Thread(new Runnable(){
////
////            @Override
////            public void run() {
////                shared.var1 = 1;
////                shared.var2 = 2;
////                shared.var3 = 3;
////            }
////
////        }).start();
//        new Thread(()-> {
//            shared.var1 = "1";
//            shared.var2 = "2";
////                                try {
////                        Thread.sleep(1000);
////                    } catch (InterruptedException e) {
////                        e.printStackTrace();
////                    }
//
//        }).start();
//        System.out.println("main thread printing value " + shared.var1);
//        new Thread(new Runnable(){
//            @Override
//            public void run() {
//                System.out.println("thread 2 printing value " + shared.var1);
//                System.out.println("thread 2 printing value " + shared.var2);
//            }
//
//        }).start();
////        new Thread(()-> {
//////            int var1     = shared.getVar1();
//////            int var2     = shared.getVar2();
//////            int var3     = shared.getVar3();
////            System.out.println("printing value " + shared.getVar1());
////            System.out.println("printing value " + shared.getVar2());
////            System.out.println("printing value " + shared.getVar3());
////        }).start();



    }
}

class Shared {
    public String var1;
    public volatile String var2;
}
