package LinkedList.DoublyList;

class Node{
    Node prev;
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Reverse {
    static Node rev(Node head){
        Node p = head;
        Node temp;
        while(p != null){
          temp = p.next;
           p.next = p.prev;
           p.prev = temp;
            head = p;
           p = p.prev; 
        }
        
        return head;
    }
    static void display(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(11);
        Node first2 = new Node(12);
        Node first3 = new Node(13);

        first.prev = null;
        first.next = first1;

        first1.prev = first;
        first1.next = first2;

        first2.prev = first1;
        first2.next = first3;

        first3.prev = first2;
        first3.next = null;

        Node result = rev(first);
        display(result);
    }
}