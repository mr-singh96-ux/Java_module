// Maximum element in a Linked List using both looping and recursive method.
package LinkedList;
import java.util.*;
class Node{
    int data;
    Node next;
}

public class MaxElements{
    static int Max(Node p){
        int max = Integer.MIN_VALUE;
        while(p != null){
            if(max < p.data){
                max = p.data;
            }
            p = p.next;
        }
        return max;
    }

    static int Max1(Node p){
        int x = 0;
        if(p == null) return Integer.MIN_VALUE;
        x = Max1(p.next);
        return x > p.data ? x : p.data;
    }
    public static void main(String[] args) {
        Node first = new Node();
        Node last, p;

        int[] arr = {1,2,3,4,5,6,17};

        first.data = arr[0];
        first.next = null;
        last = first;

        for(int i=1; i<7; i++){
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }
        p = first;
        System.out.println(Max(p));
        System.out.println(Max1(p));
    }
}