package io.ascending.training.operator;

public class Shift {
    public static void main(String[] args)
    {

        int a = 5;
        int b = -10;

        // left shift operator
        // 0000 0101<<2 =0001 0100(20)
        // similar to 5*(2^left shift n time)
        System.out.println("a<<2 = " + (a << 2));

        // right shift operator
        // 0000 0101 >> 2 =0000 0001(1)
        // similar to 5/(2^ right shift n time)
        System.out.println("a>>2 = " + (a >> 2));

        // unsigned right shift operator
        System.out.println("b>>>2 = " + (b >>> 2));
        //00000000 00000000 00000000 00000101
        System.out.println("5 <<35 = " + (5 <<35));
        System.out.println("5 << 3 = " + (5 << 3));
    }
}
