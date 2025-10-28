// Detecting a loop in a linked list (Floyd’s Cycle Detection Algorithm)
// ------------------------------------------------------------
// Concept:
// - A linked list can be either linear (ends at null) or circular (forms a loop).
// - We use two pointers: slow (P) moves one step at a time, and fast (Q) moves two steps.
// - If the list is linear, fast will reach null → no loop.
// - If the list has a loop, both pointers will eventually meet → loop detected.
// ------------------------------------------------------------
// Time Complexity: O(N)
// Space Complexity: O(1)
// ------------------------------------------------------------
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class isLoop{
    static boolean loop(Node head){
        Node p,q;
        p = q = head;
        do{
            p = p.next;
            q = q.next;
            if(q != null) q = q.next;
            if(p == q && p != null) return true;
        }while(p != null && q != null);
        return false;
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
        first2.next = second;

        second.next = second1;
        second1.next = second2;
        second2.next = second;

        System.out.println(loop(first));
    }
}