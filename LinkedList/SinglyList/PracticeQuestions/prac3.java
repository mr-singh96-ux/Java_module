//Find maximum and minimum values
package LinkedList.SinglyList.PracticeQuestions;


public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac3{
    static int max(Node p){
        int maxN = p.data;
        while(p != null){
            if(maxN < p.data){
                maxN = p.data;
            }
            p = p.next;
        } 
        return maxN;
    }

    static int min(Node p){
        int minN = p.data;
        while(p != null){
            if(minN > p.data){
                minN = p.data;
            }
            p = p.next;
        } 
        return minN;
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
        System.err.println(max(first));
        System.out.println(min(first));
    }
} 