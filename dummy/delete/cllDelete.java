package dummy.delete;

class Result {

    // Delete from Beginning
    static Node deleteFromBeginning(Node head) {
        if(head == null) return null;
        if(head.next == head) return null;

        Node p = head;
        while(p.next != head){
            p = p.next;
        }
        
        p.next = head.next;
        head = head.next;
        return head;
    }

    // Delete from End
    static Node deleteFromEnd(Node head) {
        if(head == null) return null;
        if(head.next == head) return null;

        Node p = head;
        while(p.next.next != head){
            p = p.next;
        }
        
        p.next = head;
        return head;
    }

    // Delete from Specific Position (1-based index)
    static Node deleteFromPosition(Node head, int pos) {
        if(head == null) return null;
        if(head.next == head) return null;

        if(pos == 1) return deleteFromBeginning(head);

        Node p = head;
        for(int i=1; i<pos-1 && p.next!=head; i++){
            p = p.next;
        }
        if(p.next == head) return head;

        p.next = p.next.next;
        return head;
    }

    // Display Circular Linked List
    static void display(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);

        System.out.println();
    }
}


public class cllDelete {
    public static void main(String[] args) {

        // Creating CLL: 10 → 20 → 30 → 40 → 50 → back to 10
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
        head.next.next.next.next.next = head; // circular link

        // Delete from beginning
        head = Result.deleteFromBeginning(head);

        // Delete from end
        head = Result.deleteFromEnd(head);

        // Delete from position
        head = Result.deleteFromPosition(head, 2);

        // Display final list
        Result.display(head);
    }
}


class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
