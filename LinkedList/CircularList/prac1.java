//Convert a singly linked list into a circular linked list and display its elements.
package LinkedList.CircularList;

public class Node{
    int data;
    Node next;
    Node (int d){
        this.data = d;
    }
}

public class prac1 {
static Node convert(Node head){
    Node p = head;
    int count = 0;
    while(p != null){
        count++;
        p = p.next;
    }
    Node q = head;
    for(int i=0; i<count-1; i++){
        q = q.next;
    }
    q.next = head;
    return head;
}

static void display(Node head){
    Node p = head;
    do{
        System.out.println(p.data);
        p = p.next;
    }while(p != head);
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
        first4.next = null;

        Node result = convert(first);
        display(result);
    }
}