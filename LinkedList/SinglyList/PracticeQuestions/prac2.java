//Find the last node

package LinkedList.SinglyList.PracticeQuestions;


public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac2{
    static int lastNode(Node p){
        while(p.next != null){
            p = p.next;
    }
    return p.data;        
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(11);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(14);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        System.out.println(lastNode(first));
    }
} 