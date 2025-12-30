// Reverse linked list


public class que18 {

    // Node definition
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to create a linked list from array
    static Node createList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new Node(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    // Function to print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // 🔴 Reverse function (LOGIC TO BE WRITTEN BY YOU)
    static Node reverseList(Node head) {
        if(head == null || head.next == null) return null;
        Node p = head;
        Node q = null;
        Node r = null;

        while(p != null){
            r = q;
            q = p;
            p = p.next;
            q.next=r;

        }
        head = q;
        return head;
    }

    // Main function
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};

        Node head = createList(arr);

        System.out.print("Original List: ");
        printList(head);

        head = reverseList(head);

        System.out.print("Reversed List: ");
        printList(head);
    }
}
