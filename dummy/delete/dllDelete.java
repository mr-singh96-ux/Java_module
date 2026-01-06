package dummy.delete;

class Result {

    // Delete from Beginning
    static Node deleteFromBeginning(Node head) {
        if(head == null || head.next==null) return null;

        head.next.prev = null;
        head = head.next;
        return head;
    }

    // Delete from End
    static Node deleteFromEnd(Node head) {
        if(head==null || head.next==null) return null;

        Node p = head;
        while(p.next.next != null){
            p = p.next;
        }

        p.next.prev = null;
        p.next = null;

        return head;
    }

    // Delete from Specific Position (1-based index)
    static Node deleteFromPosition(Node head, int pos) {
        if(head == null || head.next == null) return null;

        if(pos == 1){
            head.next.prev = null;
            head = head.next;
            return head;
        }

        Node p = head;
        for(int i=1; i<pos-1 && p.next!=null; i++){
            p = p.next;
        }

        if(p==null) return head;
        p.next = p.next.next;
        if(p.next != null){
            p.next.prev = p;
        }
        
        return head;
    }

    // Display DLL (forward)
    static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class dllDelete {
    public static void main(String[] args) {

        // Creating DLL: 10 <-> 20 <-> 30 <-> 40 <-> 50
        Node head = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        head.next = n2;

        n2.prev = head;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = n5;

        n5.prev = n4;

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
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}
