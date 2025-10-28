//Coping one list to other
package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac10{
   static Node first;
    static Node copy(Node head){
        Node newHead = new Node(head.data);
        Node p = newHead;
        head = head.next;
        while(head != null){
            Node newNode = new Node(head.data);
            p.next = newNode;
            p = newNode;
            head = head.next;
        }
        return newHead;
    }

   static void display(Node p){
    while(p!=null){
        System.out.println(p.data);
        p = p.next;
    }
   }
    public static void main(String[] args) {
        first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(12);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        Node last = copy(first);
        display(last);
    }
} 