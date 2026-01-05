import java.util.*;

// Node definition
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Result {

    /*
     * Function to find union of two linked lists
     * head1 -> head of first linked list
     * head2 -> head of second linked list
     *
     * Return head of the union linked list
     *
     * WRITE ONLY THE LOGIC HERE
     */
    static Node getUnion(Node head1, Node head2) {

        if(head1==null || head2==null){
            return null;
        }

        Node p = head1;
        Node q = head2;
        while(p.next != null){
            p = p.next;
        }
        p.next = q;
        Node r = head1;
        ArrayList<Integer> l = new ArrayList<>();
        while(r != null){
            l.add(r.data);
            r = r.next;
        }
        Collections.sort(l);

        Node newHead = new Node(0);
        Node tail = newHead;
        for(int n : l){
            tail.next = new Node(n);
            tail = tail.next;
        }
        return newHead.next; // placeholder
    }
}

public class q29 {

    // Create linked list from array
    static Node createList(int[] arr) {
        if (arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node temp = head;

        for (int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    // Print linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // first list
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // second list
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        Node head1 = createList(arr1);
        Node head2 = createList(arr2);

        Node unionHead = Result.getUnion(head1, head2);

        if (unionHead != null) {
            printList(unionHead);
        } else {
            System.out.println("No Union");
        }

        sc.close();
    }
}
