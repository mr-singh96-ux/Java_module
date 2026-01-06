package dummy.insert;

class Result {

    // Insert at Beginning
    static Node insertAtBeginning(Node head, int data) {
        // if(head==null){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
        // }
        return head;
    }

    // Insert at End
    static Node insertAtEnd(Node head, int data) {
        if(head == null) return new Node(data);
        Node  p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = new Node(data);

        return head;
    }

    // Insert at Specific Position (1-based index)
    static Node insertAtPosition(Node head, int data, int pos) {

        if(pos==1){
            Node temp = new Node(data);
            temp.next = head;
            head = temp;
            return head; 
        }

        

        Node p = head;
        for(int i=1; i<pos-1 && p!=null; i++){
            p = p.next;
        }

        if(p == null) return head;

        Node temp = new Node(data);
        temp.next = p.next;
        p.next = temp; 
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


public class sll { 
    public static void main(String[] args) {

        Node head = null;

        // Test insert at beginning
        head = Result.insertAtBeginning(head, 10);
        head = Result.insertAtBeginning(head, 5);

        // Test insert at end
        head = Result.insertAtEnd(head, 20);
        head = Result.insertAtEnd(head, 30);

        // Test insert at specific position
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
