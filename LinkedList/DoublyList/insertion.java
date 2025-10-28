package LinkedList.DoublyList;

class Node{
    Node prev;
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class insertion {

    static Node insert(Node head, int pos){
        Node temp, p = head;
        if(pos == 0){
            temp = new Node(12);
            temp.next = head;
            head.prev = temp;
            head = temp;
        }else{
            for(int i=0; i<pos-1; i++){
                p = p.next;
            }
            if(p == null) return head; //position out of range
            temp = new Node(19);
            temp.prev = p;
            temp.next = p.next;
            if(p.next != null){
                p.next.prev = temp;
            }
            p.next = temp;
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
        Node result = insert(first, 2);
        display(result);
    }
}