//Count occurrences of a number
package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac6{
    static int count(Node p, int n){
        int c = 0;
        while(p != null){
            if(p.data == n){
                c++;
            }
            p = p.next;
        }
        return c;
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
        System.out.println(count(first, 10));
    }
} 