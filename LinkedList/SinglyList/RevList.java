//Reversing a LinkedList by reversing element. In this method we will copy all nodes data into an array and then copy back to the nodes from starting from last of the array.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
    Node(int d){
        this.data = d;
    }
}

public class RevList{
    static Node rev(Node head){
        int count = 0;
        Node p = head;
        while(p != null){
            count++;
            p = p.next;
        }
        int i = 0;
        p = head;
        int[] arr = new int[count];
        while(p != null){
            arr[i++] = p.data;
            p = p.next;
        }
        i = count - 1;
        p = head;
        while(p != null){
            p.data = arr[i--];
            p = p.next;
        }
        return head;
    }

    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }

    }
    public static void main(String[] args) {
        Node first = new Node(10);
        Node first1 = new Node(11);
        Node first2 = new Node(12);
        Node first3 = new Node(13);

        first.next = first1;
        first1.next = first2;
        first2.next = first3;
        first3.next = null;
        Node result = rev(first);
        display(result);
    }
}