// Creating Multiple Nodes and Linking Them
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class Basic{
    public static void main(String[] args) {
        Node first = new Node();
        Node second = new Node();
        Node third = new Node();
        first.data = 10;
        first.next = second;
       
        second.data = 11;
        first.next = third;

        third.data = 12;
        third.next = null;

        System.out.println(first.data);
        System.out.println(third.next);
    }
}