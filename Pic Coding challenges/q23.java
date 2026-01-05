import java.util.*;

// reverse k nodes of linked list
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Result {

    
    static Node revAltKNodes(Node head, int k) {

        if(head==null || k<=1){
            return head;
        }

        ArrayList<Integer> l = new ArrayList<>();
        Node p = head;
        while(p != null){
            l.add(p.data);
            p = p.next;
        }

        for(int i=0;i<l.size(); i+=2*k){
            int low = i;
            int high = Math.min(i + k - 1, l.size() - 1);
            while(low<high){
                int temp = l.get(low);
                l.set(low,l.get(high));
                l.set(high, temp);
                low++;
                high--;
            }
        }

        Node newHead = new Node(0);
        Node tail = newHead;
        for(int i=0;i<l.size();i++){
            tail.next = new Node(l.get(i));
            tail = tail.next;
        }
        return newHead.next;
    }
}

public class q23 { 

    // Create linked list
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

        int t = sc.nextInt(); // number of test cases

        while (t-- > 0) {
            int n = sc.nextInt(); // number of nodes
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int k = sc.nextInt(); // value of k

            Node head = createList(arr);

            head = Result.revAltKNodes(head, k);

            printList(head);
        }

        sc.close();
    }
}
