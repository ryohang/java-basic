package io.ascending.training.lambda;

public class DecorableImpl {
    public static void main(String[] args) {
        // Using lambada expression
        Decorable decorableImple=()->{System.out.println("Decorating with curtains");};
        decorableImple.decorateWithCurtains();
        decorableImple.decorateWithPaints();
        System.out.println(decorableImple.hashCode());

    }

}
