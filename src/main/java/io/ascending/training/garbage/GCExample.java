package io.ascending.training.garbage;

public class GCExample {
    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            GCExample gc1 = new GCExample();
            GCExample gc2 = new GCExample();

            // Nullifying the reference variable
            gc1 = null;

            // requesting JVM for running Garbage Collector
            System.gc();

            // Nullifying the reference variable
            gc2 = null;

            // requesting JVM for running Garbage Collector
            Runtime.getRuntime().gc();
            System.out.println("=====================>");
        }
    }
    @Override
    // finalize method is called on object once
    // before garbage collecting it
    protected void finalize() throws Throwable
    {
        System.out.println("Garbage collector called");
        System.out.println("Object garbage collected : " + this);
    }

}
