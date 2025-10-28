//Reversing the LL using sliding pointers. Here we will use three pointers p, q and r. p will points on first node q and r on the null initially then all three will move on each other path as p is on first and when it will move on to second q will be on first and when q moves on second and p on third, then r will be on first.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class RevList1{

    static Node rev(Node head){
        Node p = head;
        Node q = null;
        Node r = null;
        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next = r;
        }
        head = q;
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
        Node first1 = new Node(11);
        Node first2 = new Node(12);
        Node first3 = new Node(13);

        first.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = null;

        Node result = rev(first);
        display(result);
    }
}