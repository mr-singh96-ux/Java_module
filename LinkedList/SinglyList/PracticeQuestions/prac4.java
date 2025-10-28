//Print alternate nodes

package LinkedList.SinglyList.PracticeQuestions;


public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac4{
    static void displayAlt(Node p){
        
        while(p != null){
            p = p.next;
            System.out.println(p.data);
            if(p.next == null) break;
            // p = p.next.next;
            p = p.next;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(14);
        Node six = new Node(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = null;
        displayAlt(first);
    }
} 