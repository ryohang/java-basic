package io.ascending.training;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GenericTypeLesson <T>{

    public void print( T[] inputArray ) {
    // Display array elements
        for(T element : inputArray) {
            System.out.printf("%s ", element);
        }
//    System.out.println();
    }


    public static void main(String args[]) {

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Character[]  strArray = { 'H', 'E', 'L', 'L', 'O' };
        //E = String

        GenericTypeLesson<Character> strPrinter = new GenericTypeLesson();
        strPrinter.print(strArray);
        GenericTypeLesson<Integer> intPrinter = new GenericTypeLesson();
        intPrinter.print(intArray);
        // Create arrays of Integer, Double and Character
//        Integer[] intArray = { 1, 2, 3, 4, 5 };
//        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
//        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };
//
//        System.out.println("Array integerArray contains:");
//        printArray(intArray);   // pass an Integer array
//
//        System.out.println("\nArray doubleArray contains:");
//        printArray(doubleArray);   // pass a Double array
//
//        System.out.println("\nArray characterArray contains:");
//        printArray(charArray);   // pass a Character array

//        Set s = new HashSet<>();
//        s.
    }
}
