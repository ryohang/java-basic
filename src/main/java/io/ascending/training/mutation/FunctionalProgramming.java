package io.ascending.training.mutation;

import java.util.Arrays;
import java.util.List;

public class FunctionalProgramming {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        int total=0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)%2==0){
                total+=(numbers.get(i)*2);
            }
        }
        System.out.println(total);

        System.out.println("==>>>>>>>>>>>>>> functional programming >>>>>>>>>>>>>>>>===");
        System.out.println(
                numbers.stream().filter(e->e%2==0).mapToInt(e->e*2).sum()
        );
    }
}
