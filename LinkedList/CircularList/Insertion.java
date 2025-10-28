//Inserting a new node in CLL before first as well as at any other place

package LinkedList.CircularList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Insertion{

    static Node insert(Node head, int pos){
        Node temp;
        Node p = head;
        if(pos == 0){
            temp = new Node(15);
            if(head == null){
                head = temp;
                head.next = head;
            }
            else{
                while(p.next != head) p = p.next;
                p.next = temp;
            temp.next = head;
            head = temp;
        }
    }
        else{
            for(int i=0; i<pos-1; i++){
                p = p.next;
            }
            temp = new Node(11);
            temp.next = p.next;
            p.next = temp;
        }    
        return head;    
    }

    static void display(Node head){
        Node p = head;
        do{
            System.out.println(p.data);
            p = p.next;
        }while(p != head);
    } 
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(10);
        Node first2 = new Node(10);
        Node first3 = new Node(10);
        Node first4 = new Node(10);
        Node first5 = new Node(10);

        first.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = first4;
        first4.next = first5;
        first5.next = first;

        Node result = insert(first, 0);
        display(result);
    }
}