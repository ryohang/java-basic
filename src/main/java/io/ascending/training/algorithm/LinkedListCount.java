package io.ascending.training.algorithm;

import io.ascending.training.support.LinkedListNode;

import java.util.List;

public class LinkedListCount {
    public int countLinkList(LinkedListNode head){
        int count = 1;
        while(head.next!=null){
            count++;
            head = head.next;
        }
        return count;
    }
    public LinkedListNode findMiddle(LinkedListNode head){
        LinkedListNode fast= head;
        LinkedListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args){
        LinkedListNode n1 = new LinkedListNode(5);
        LinkedListNode n2 = new LinkedListNode(4);
        LinkedListNode n3 = new LinkedListNode(3);
        LinkedListNode n4 = new LinkedListNode(2);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        LinkedListCount solution = new LinkedListCount();
//        int result = solution.countLinkList(n1);
//        System.out.println("result is : "+result);

        LinkedListNode mid = solution.findMiddle(n1);
        System.out.println("mid node is : "+mid.val);
    }
}
