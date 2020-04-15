package io.ascending.training.algorithm;

public class Factorial {

    public int solution(int n){
        if(n<=1) return 1;
        return n * solution(n-1);
    }

    public static void main(String[] args){
        Factorial f = new Factorial();
        System.out.println(f.solution(3));
    }
}
