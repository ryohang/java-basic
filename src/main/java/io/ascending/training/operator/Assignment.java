package io.ascending.training.operator;

import java.util.ArrayList;
import java.util.List;

public class Assignment {
    static class Test
    {
        int x;
        Test(int i) { x = i; }
        Test()      { x = 0; }
    }
    public static void main(String[] args)
    {
        int a = 20, b = 10, c, d, e = 10, f = 4, g = 9;

        // simple assignment operator
        c = b;
        System.out.println("Value of c = " + c);

        // This following statement would throw an exception
        // as value of right operand must be initialised
        // before assignment, and the program would not
        // compile.
        // c = d;

        // instead of below statements, shorthand
        // assignment operators can be used to
        // provide same functionality.
        a = a + 1;
        b = b - 1;
        e = e * 2;
        f = f / 2;
        System.out.println("a, b, e, f = " + a + ", "
                + b + ", " + e + ", " + f);
        a = a - 1;
        b = b + 1;
        e = e / 2;
        f = f * 2;

        // shorthand assignment operator
        a -= 1;
        b += 1;
        e /= 2;
        f *= 2;

        System.out.println("a, b, e, f ("
                + "using shorthand operators)= "
                + a + ", " + b + ", "
                + e + ", " + f);
        swapValue(a,b);
        System.out.println("a, b ("
                + "pass by value)= "
                + a + ", " + b);
////
        Integer i = new Integer(10);
        Integer j = new Integer(20);
        swap(i, j);
        System.out.println("i = " + i + ", j = " + j);

        int ix = 10;
        int jx = 20;
        swapValue(ix,jx);
        System.out.println(ix);
        System.out.println(jx);

        List<Integer> integerList = new ArrayList();
        addValue(integerList);
        System.out.println(integerList);
//        Test t = new Test(5);
//        change(t);
//        System.out.println(t.x);
    }

    public static void addValue(List<Integer> ls){
        ls.add(new Integer(5));
    }

    //a=copy(ix), b=copy(jx)
    public static void swapValue(int a, int b){
        int temp=b;
        b=a;
        a=temp;

    }

    public static void swap(Integer i, Integer j)
    {
        Integer temp = new Integer(i);
        i = j;
        j = temp;
    }

    public static void change(Test t)
    {
        t.x = 10;
//        t= new Test(10)
    }

}

