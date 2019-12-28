package io.ascending.training.lambda;

@FunctionalInterface
public interface Decorable {
    // one abstract method
    void decorateWithCurtains();

    default void decorateWithPaints()
    {
        System.out.println("Decorating using paints");
    }

    // Overriding method of java.lang.Object
//    @Override
//    public int hashCode();
}
