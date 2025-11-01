//Split a circular linked list into two halves.
package LinkedList.CircularList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class prac2 {
static Node cut(Node head){
    Node slow, fast;
    slow = fast = head;
    while(fast.next != head && fast.next.next != head){
        slow  = slow.next;
        fast = fast.next.next;
    }
    if(fast.next.next == head){
        fast = fast.next;
    }
    Node head1 = head;
    Node head2 = slow.next;

    slow.next = head1;
    fast.next = head2;

    return head2;
}
static void printList(Node head){
    Node p = head;
    do{
        System.out.println(p.data);
        p = p.next;
    }while(p != head);
}

static int isCir(Node head){
    Node p = head.next;
    if(head == null) return 0;
    if(head.next == head) return 1;
    while(p!=null && p!=head){
        p = p.next;
    }
    return (p == head) ? 1:0;
}
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(11);
        Node first2 = new Node(12);
        Node first3 = new Node(13);
        Node first4 = new Node(14);

        first.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first4.next = first;
        System.out.println(isCir(first1));
        Node head2 = cut(first);

        System.out.print("First half: ");
        printList(first);

        System.out.print("Second half: ");
        printList(head2);
    }
}