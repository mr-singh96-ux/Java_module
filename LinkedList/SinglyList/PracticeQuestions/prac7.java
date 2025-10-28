//Check if linked list has only one node

package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac7{
   static boolean oneNode(Node p){
    int count = 0;
    while (p != null){
        count++;
        p = p.next;
    }
    if(count == 1) return true;
    return false;
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
        System.out.println(oneNode(first));
    }
} 