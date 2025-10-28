//Print the data of the N-th node in the linked list.

package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac1{
    static int nNode(int index, Node p){
        for(int i=0; i<index-1; i++){
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
        System.out.println(nNode(2, first));
    }
} 