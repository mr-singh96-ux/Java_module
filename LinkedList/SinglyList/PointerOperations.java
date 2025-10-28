// Operations of the pointers as discussed in lecture no. 173

package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class PointerOperations{
    public static void main(String[] args) {
        Node first = new Node();
        Node p = first;
        Node second = new Node();
        Node third = new Node();
        // if(p.next==null)
        System.out.println(p.next==null);
        first.data = 10;
        first.next = second;

        second.data = 11;
        second.next = null;
        System.out.println(p.next==null);

        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
}