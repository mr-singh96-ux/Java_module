// This program merges two sorted linked lists into one sorted list without creating new nodes.
// We use two pointers — third (head of merged list) and last (tail).
// We first pick the smaller head node as the start (third = last = that node).
// Then, we compare elements one by one, attach the smaller node to last.next, and move pointers accordingly.
// When one list ends, we connect the rest of the other list.
// It runs in O(M + N) time and uses no extra space, only pointer links are adjusted.

package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Merging{
    static Node merge(Node first, Node second){
        Node third, last;
        if(first.data < second.data){
            third = first;
            last = first;
            first = first.next;
        }
        else{
            third = second;
            last = second;
            second = second.next;
        }
        while(first != null && second != null){
            if(first.data < second.data){
                last.next = first;
                last = first;
                first = first.next;
                last.next = null;
            }
            else{
                last.next = second;
                last = second;
                second = second.next;
                last.next = null;
            }
        }
        if(first != null) 
            last.next = first;
        else 
            last.next = second;
        return third;
    }

    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(11);
        Node first2 = new Node(12);

        Node second = new Node(5);
        Node second1 = new Node(6);
        Node second2 = new Node(7);

        first.next = first1;
        first1.next = first2;
        first2.next = null;

        second.next = second1;
        second1.next = second2;
        second2.next = null;

        Node result = merge(first, second);
        display(result);
    }
}