package dummy.insert;

class Result {

    // Insert at Beginning
    static Node insertAtBeginning(Node head, int data) {

        if(head == null){
        Node temp = new Node(data);
        temp.next = temp;
        return temp;    
        }

        Node p = head;
        while(p.next != head){
            p = p.next;
        }
        Node temp = new Node(data);
        p.next = temp;
        temp.next = head;
        head = temp;
        return head;
    }

    // Insert at End
    static Node insertAtEnd(Node head, int data) {
        if(head == null){
            Node temp = new Node(data);
            temp.next = temp;
            return temp;
        }
        
        Node p = head;
        while(p.next != head){
            p = p.next;
        }

        Node temp = new Node(data);
        p.next = temp;
        temp.next = head;

        return head;
    }

    // Insert at Specific Position (1-based)
    static Node insertAtPosition(Node head, int data, int pos) {

       if(pos == 1){
        return insertAtBeginning(head, data);
       }

        Node p = head;

        for(int i=1;i<pos-1 && p.next != head; i++){
            p = p.next;
        }

        // if(p==null) return head;

        Node temp = new Node(data);
        temp.next = p.next;
        p.next = temp;

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

public class cll {
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
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
