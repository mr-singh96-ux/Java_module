// whether a given linked list is sorted or not.
package LinkedList;

class Node{
    int data;
    Node next;
}

public class Sorted{
    static Node first;
    static boolean isSorted(Node p){
        int x = Integer.MIN_VALUE;
        while(p != null){
        if(p.data < x){
            return false;
        }
        x = p.data;
        p = p.next;        
    }
    return true;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // int[] arr = {5,4,3,2,1};
        first = new Node();
        Node last, p;
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
        p = first;
        System.out.println(isSorted(p));
    }
}