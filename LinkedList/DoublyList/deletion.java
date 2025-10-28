package LinkedList.DoublyList;

class Node{
    Node prev;
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class deletion {
    static Node del(Node head,int pos){
        Node p = head;
        if(pos == 1){
            head = head.next;
            if(head != null)
            head.prev = null;
        }
        
        else{
            for(int i=0; i<pos-1; i++){
                p = p.next;
            }
            if(p == null) return head;
            if(p.prev != null)
            p.prev.next = p.next;
            if(p.next != null)
            p.next.prev = p.prev;
        }
        return head;
    }

    static void display(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(11);
        Node first2 = new Node(12);
        Node first3 = new Node(13);

        first.prev = null;
        first.next = first1;

        first1.prev = first;
        first1.next = first2;

        first2.prev = first1;
        first2.next = first3;

        first3.prev = first2;
        first3.next = null;

        Node result = del(first, 2);
        display(result);
    }
}