package io.ascending.training.algorithm;


public class Fibnacci {
    public int recur(int k){
        if(k<=0) return 0;
        if(k<=2)return 1;
        return recur(k-1)+recur(k-2);
    }

    public int recurWithMem(int k,int[] mem){
        if(mem[k]>0)return mem[k];
        if(k<=0)return 0;
        if(k<=2){
            mem[k]=1;
            return mem[k];
        }
        int val = recurWithMem(k-1,mem)+recurWithMem(k-2,mem);
        mem[k] = val;
        return mem[k];
    }

    public int dp(int k){
       int[] arr = new int[k+2];
       arr[1]=1;
       arr[2]=1;
       for(int i=2; i<=k;i++){
           arr[i]=arr[i-1]+arr[i-2];
       }
       return arr[k];
    }



    public static void main(String[] args){
        Fibnacci fib = new Fibnacci();
        long current = System.currentTimeMillis();
        int k=40;
        System.out.println(current);
        System.out.println(fib.recur(k));
        Long millionSecs = (System.currentTimeMillis()-current);
        System.out.println("cacluating time for recursive without memory million seconds: "+millionSecs);

        current = System.currentTimeMillis();

        int[] memory = new int[k+1];
        System.out.println(fib.recurWithMem(k,memory));
        millionSecs = (System.currentTimeMillis()-current);
        System.out.println("cacluating time for recursive with memory million seconds: "+millionSecs);

        System.out.println(fib.dp(k));
//        System.out.println("cacluating time for recursive with memory million seconds: "+millionSecs);


    }
}
