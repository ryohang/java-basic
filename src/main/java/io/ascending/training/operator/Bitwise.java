package io.ascending.training.operator;

public class Bitwise {
    public static void main(String[] args)
    {
        // if int a = 010
        // Java considers it as octal value
        // of 8 as number starts with 0.
        int a = 5;
        int b = 7;

        // bitwise and
        // 0101 & 0111=0101
        System.out.println("a&b = " + (a & b));

        // bitwise and
        // 0101 | 0111=0111
        System.out.println("a|b = " + (a | b));

        // bitwise xor
        // 0101 ^ 0111=0010
        System.out.println("a^b = " + (a ^ b));

        // bitwise and
        // ~0101=1010
        System.out.println("~a = " + ~a);

        // can also be combined with
        // assignment operator to provide shorthand
        // assignment
        // a=a&b
        a &= b;
        System.out.println("a= " + a);
    }
}
