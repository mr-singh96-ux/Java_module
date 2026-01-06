package dummy.insert;

class Result {

    // Insert at Beginning
    static Node insertAtBeginning(Node head, int data) {
        Node temp = new Node(data);

        if(head == null){
            return temp;
        }
        temp.next = head;
        head.prev = temp;
        temp.prev = null;
        head = temp;        
        return head;
    }

    // Insert at End
    static Node insertAtEnd(Node head, int data) {
        Node temp = new Node(data);

        if(head == null) return temp;
        Node p = head;
        while(p.next != null){
            p = p.next;
        }

        temp.prev = p;
        temp.next = null;
        p.next = temp;
        
        return head;
    }

    // Insert at Specific Position (1-based index)
    static Node insertAtPosition(Node head, int data, int pos) {
        
        Node temp = new Node(data);
        if(head == null) return temp;

        if(pos == 1){
            head.prev = temp;
            temp.next = head;
            head = temp;
            return head;
        }

        Node p = head;
        for(int i=1; i<pos-1 && p.next!=null; i++){
            p = p.next;
        }

        temp.next = p.next;
        temp.prev = p;

        if(p.next!=null)
        p.next.prev = temp;
    
        p.next = temp;

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


public class dll {
    public static void main(String[] args) {

        Node head = null;

        // Insert at beginning
        head = Result.insertAtBeginning(head, 10);
        head = Result.insertAtBeginning(head, 5);

        // Insert at end
        head = Result.insertAtEnd(head, 20);
        head = Result.insertAtEnd(head, 30);

        // Insert at position
        head = Result.insertAtPosition(head, 15, 3);

        // Display list
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
