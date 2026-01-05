//Spilt circular linked list in two equal parts
import java.util.*;

// Node definition for Circular Linked List
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    static Node listCut(Node head) {

        if(head==null || head.next==null){
            return head;
        }

        Node slow = head;
        Node fast = head;

        while(fast.next!=head && fast.next.next!=head){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next.next==head){
            fast = fast.next;
        }

        Node head2 = slow.next;
        slow.next = head;
        fast.next = head2;

        return head2;
    }
}

public class q21 {

    // Function to create circular linked list
    static Node createCircularList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        temp.next = head; // make it circular
        return head;
    }

    // Function to print circular linked list
    static void printCircularList(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.data + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of nodes
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Node head = createCircularList(arr);

            // Call split function
            Node head2 = Solution.listCut(head);

            // Print both circular lists
            printCircularList(head);
            printCircularList(head2);
        }

        sc.close();
    }
}
