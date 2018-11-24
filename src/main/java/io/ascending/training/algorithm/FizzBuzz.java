package io.ascending.training.algorithm;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> solution(int n){
        List<String> array = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                array.add("FizzBuzz");
            }else if(i%3==0){
                array.add("Fizz");
            }else if(i%5==0){
                array.add("Buzz");
            }else{
                array.add(String.valueOf(i));
            }
        }
        return array;
    }
    public static List<String> staticSolution(int n){
        List<String> array = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                array.add("FizzBuzz");
            }else if(i%3==0){
                array.add("Fizz");
            }else if(i%5==0){
                array.add("Buzz");
            }else{
                array.add(String.valueOf(i));
            }
        }
        return array;
    }

    public static void main(String[] args){
        FizzBuzz fb = new FizzBuzz();
        List<String> result = fb.solution(16);
        System.out.println(result);
        System.out.println(FizzBuzz.staticSolution(16));

        String test = "testasdfasdf";
        System.out.println(test);
    }
}
