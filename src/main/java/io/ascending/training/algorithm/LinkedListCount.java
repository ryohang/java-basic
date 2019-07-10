package io.ascending.training.algorithm;

import io.ascending.training.support.LinkedListNode;

public class LinkedListCount {
    public int countLinkList(LinkedListNode head){
        int count = 1;
        while(head.next!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public static void main(String[] args){
        LinkedListNode n1 = new LinkedListNode(5);
        LinkedListNode n2 = new LinkedListNode(4);
        n1.next=n2;
        LinkedListCount solution = new LinkedListCount();
        int result = solution.countLinkList(n1);
        System.out.println("result is : "+result);
    }
}
