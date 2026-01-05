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
     * Function to find intersection point of two linked lists
     * head1 -> head of first linked list
     * head2 -> head of second linked list
     *
     * Return the intersecting node (or null if no intersection)
     *
     * WRITE ONLY THE LOGIC HERE
     */
    static Node getIntersection(Node head1, Node head2) {

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();
        

        if(head1==null || head2==null) return null;
        Node p = head1;
        Node q = head2;

        while(p!=null){
            l1.add(p.data);
            p = p.next;
        }

        while(q!=null){
            l2.add(q.data);
            q = q.next;
        }

        Node newHead = new Node(0);
        Node tail = newHead;

        Collections.sort(l1);
        Collections.sort(l2);


        for(int n : l1){
            if(l2.contains(n)){
                tail.next = new Node(n);
                tail = tail.next;
            }
        }

        return newHead.next; // placeholder
    }
}

public class q28 {

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

        Node intersection = Result.getIntersection(head1, head2);

        if (intersection != null) {
            printList(intersection);
        } else {
            System.out.println("No Intersection");
        }

        sc.close();
    }
}
