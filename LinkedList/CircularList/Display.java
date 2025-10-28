//Display the nodes of a CLL
package LinkedList.CircularList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Display{
    static void display(Node head){
        Node p,q;
        p = q = head;
        do{
            System.out.println(p.data);
            p = p.next;
        }    while(p != q);
    }
    static int flag = 0;
    static void displayRec(Node p, Node head){
        if(p != head || flag == 0){
            flag = 1;
            System.out.println(p.data);
            displayRec(p.next, head);
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(10);
        Node first2 = new Node(10);
        Node first3 = new Node(10);
        Node first4 = new Node(10);
        Node first5 = new Node(10);

        first.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first4.next = first5;
        first5.next = first;
        display(first1);
        System.out.println();
        displayRec(first, first);
    }
}