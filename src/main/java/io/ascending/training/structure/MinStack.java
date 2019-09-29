package io.ascending.training.structure;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/discuss/49157/Java-solution-with-one-LinkedList
public class MinStack {
    Stack<Integer> stk = new Stack<>();
    Stack<Integer> stk2 = new Stack<>();

    public void push(int x) {
        stk.push(x);                             //Always push into main stack
        if(stk2.isEmpty() || x <= stk2.peek())   //Push when empty OR x<= current smallest value
            stk2.push(x);
    }

    public void pop() {
        if(stk.pop().equals(stk2.peek()))    //Main stk always pop
            stk2.pop();                      //Other stk pops only if it equal to main stk's min
    }

    public int top() {
        return stk.peek();
    }

    public int getMin() {
        return stk2.peek();
    }
    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(0);
        minStack.push(-3);
        minStack.push(-1);
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }
}
