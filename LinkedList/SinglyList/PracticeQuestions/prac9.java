//Reverse the given linked list
package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac9{
   static Node first;
    static Node reverse(Node head){
        Node newHead = null;
        while(head != null){
            Node temp = head;
            head = head.next;
            temp.next = newHead;
            newHead = temp;
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
        first = reverse(first);
        display(first);
    }
} 