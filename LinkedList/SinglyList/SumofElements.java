// Sum of elements usin g both recursive as well as looping methode.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class SumofElements{

    static int add(Node p){
        int sum = 0;
        while(p != null){
            sum += p.data;
            p = p.next;
        }
        return sum;
    }

    static int sum(Node p){
        if(p == null) return 0;
        return p.data+sum(p.next);
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
        System.out.println(add(p));
        System.out.println(sum(p));
    }
}