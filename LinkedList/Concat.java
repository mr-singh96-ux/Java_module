//Concatenating two LL using one pointer p that first traverse first LL and when reached null stopped. Then, with p.next we will link it to the pointer of the second LL pointing first node of that list.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class Concat{
    static Node concat(Node fhead, Node shead){
        Node p = fhead;
        while(p.next != null){
            p = p.next;
        }
        p.next = shead;
        return fhead;
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

        Node second = new Node(5);
        Node second1 = new Node(6);
        Node second2 = new Node(7);

        first.next = first1;
        first1.next = first2;
        first2.next = null;

        second.next = second1;
        second1.next = second2;
        second2.next = null;

        Node result = concat(first, second);
        display(result);
    }
}