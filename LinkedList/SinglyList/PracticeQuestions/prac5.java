//Print even and odd nodes separately
package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac5{
    static void odd(Node p){
        while(p != null){
            if(p.data %2 != 0){
                System.out.println("Odd: "+p.data);
            }
            p = p.next;
        }
    }

    static void even(Node p){
       while(p != null){
            if(p.data %2 == 0){
                System.out.println("Even: "+p.data);
            }
            p = p.next;
        } 
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
        odd(first);
        System.out.println();
        even(first);
    }
} 