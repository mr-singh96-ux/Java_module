//Countinmg number of nodes using both looping and recursive method.
package LinkedList;

class Node{
    int data;
    Node next;
}

public class CountNodes{

    static void CountNodes(Node p){
        int count = 0;
        while(p != null){
            count++;
            p = p.next;
        }
        System.out.println(count);
    }

    static int count(Node p){
        int c = 0;
        if(p == null) return 0;
        return count(p.next)+1;
    }
    public static void main(String[] args) {
        Node first = new Node();
        Node last, p;

        int[] arr = {1,2,3,4,5,6,7};

        first.data = arr[0];
        first.next = null;
        last = first;

        for(int i=1; i<7; i++){
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }

        p = first;
        CountNodes(p);
        System.out.println(count(p));
    }
}