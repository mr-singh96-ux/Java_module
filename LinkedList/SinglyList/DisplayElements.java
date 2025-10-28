// Display all the elements of a linked list.

package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class DisplayElements{
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        Node p = first;
        first.data = 10;
        second.data = 11;
        third.data = 12;

        first.next = second;
        second.next = third;

        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }

    }
}