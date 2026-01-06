package dummy.delete;

class Result {

    // Delete from Beginning
    static Node deleteFromBeginning(Node head) {
        if(head == null) return null;
        head = head.next;
        return head;
    }

    // Delete from End
    static Node deleteFromEnd(Node head) {
        if(head == null || head.next==null) return null;
        Node p = head;
        while(p.next.next!= null){
            p = p.next;
        }
        p.next = null;
        return head;
    }

    // Delete from Specific Position (1-based index)
    static Node deleteFromPosition(Node head, int pos) {
        if(head == null) return null;

        if(pos == 1){
            head = head.next;
            return head;
        }

        Node p = head;

        for(int i=1; i<pos-1 && p.next!=null; i++){
            p = p.next;
        }

        if(p.next == null) return head;
            p.next = p.next.next;

        return head;
    }

    // Display Linked List
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}


public class sllDelete {
    public static void main(String[] args) {

        // Creating sample list: 10 → 20 → 30 → 40 → 50
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        // Delete from beginning
        head = Result.deleteFromBeginning(head);

        // Delete from end
        head = Result.deleteFromEnd(head);

        // Delete from position
        head = Result.deleteFromPosition(head, 10);

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