//Remove duplicate values (unsorted)
package LinkedList.SinglyList.PracticeQuestions;

public class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
    }
}

public class prac8{
   static void remDup(Node head){    
    Node p = head;
    while(p != null){
        Node q = p;
        while(q.next != null){
        if(q.next.data == p.data){
            q.next = q.next.next;
        }else{
            q = q.next;
        }
    }
        p = p.next;
    
}
   }
   static void display(Node p){
    while(p!=null){
        System.out.println(p.data);
        p = p.next;
    }
   }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(12);
        Node fourth = new Node(13);
        Node fifth = new Node(12);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = null;
        remDup(first);
        display(first);
    }
} 