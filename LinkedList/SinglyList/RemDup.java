//Removing duplicates from a linked list using two pointers p and q, one pointer p refernce to first node and q to the next node for comparing data in nodes.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class RemDup{
    static Node rem(Node head){
        Node p, q;
        p = head;
        q = head.next;
        while(q != null){
            if(p.data != q.data){
                p = q;
                q = q.next;
            }
            else{
                p.next = q.next;
                q = p.next;
            }
        }
        return head;
    }

    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public static void main(String[] args) {
    Node first = new Node(10);
    Node second = new Node(11);
    Node third = new Node(11);
    Node fourth = new Node(13);
    
    first.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next = null;
        Node result = rem(first);
        display(result); 
    }
}