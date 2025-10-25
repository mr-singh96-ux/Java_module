// Display all the elements of a linked list.

package LinkedList;

class Node{
    int data;
    Node next;
}

public class DisplayElements1{
    public static void main(String[] args) {
        Node first = new Node();
        Node last = new Node();
        Node p = first;
        
        int[] arr = {1,2,3,4,5};
        first.data = arr[0];
        first.next = null;
        last = first;

        for(int i=1; i<5; i++){
             Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }

        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }

    }
}