//Deleting a specific node from a CLL.
package LinkedList.CircularList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Deletion {
    static Node del(Node head, int pos){
        Node p = head;
        Node q;
        if(pos == 1){
            while(p.next != head){
                p = p.next;
            }
            if(p == head){
                head = null;
                head.next = head;
            }
            else{
            p.next = head.next;
            head = p.next;
        }
    }else{
        for(int i=0; i<pos-2; i++){
            p = p.next;
        }
        q = p.next;
        p.next = q.next;
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
        Node first1 = new Node(11);
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

        Node result = del(first, 2);
        display(result);
    }
}