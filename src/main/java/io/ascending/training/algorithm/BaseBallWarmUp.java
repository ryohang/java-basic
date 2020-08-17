package io.ascending.training.algorithm;

import java.util.Stack;

public class BaseBallWarmUp {
    public int calPoints(String[] ops) {
        int sum=0;
        Stack<Integer> history = new Stack();
        for(String str: ops){
            Integer currentPoint;
            switch (str) {
                case "+":
                    if(history.size()>1){
                        Integer last = history.pop();
                        Integer lastLast = history.peek();
                        currentPoint = last+lastLast;
                        sum+=currentPoint;
                        history.push(last);
                        history.push(currentPoint);
                    }
                    break;
                case "D":
                    if(history.size()>0){
                        Integer lastRound = history.peek();
                        currentPoint = lastRound*2;
                        sum+=currentPoint;
                        history.push(currentPoint);
                    }
                    break;
                case "C":
                    if(history.size()>0){
                        currentPoint = history.pop();
                        sum-=currentPoint;
                    }
                    break;
                default:
                    currentPoint = Integer.valueOf(str);
                    sum+=currentPoint;
                    history.push(currentPoint);
                    break;
            }
//            System.out.println("current round:"+sum);
        }
        return sum;
    }
    public static void main(String[] args){
        String[] vals = {"5","-2","4","C","D","9","+","+"};
        BaseBallWarmUp bbwp = new BaseBallWarmUp();
        System.out.println(bbwp.calPoints(vals));
    }
}
