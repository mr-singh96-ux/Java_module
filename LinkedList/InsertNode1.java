//Inserting elements at the last of the LL
package LinkedList;

class Node{
    int data;
    Node next;
}

public class InsertNode1{
    static Node first, last;
    static void insertLast(int x){
        Node t = new Node();
        t.data = x;
        t.next = null;
        if(first == null){
            first = t;
            last = t;
        }
        else{
            last.next = t;
            last = t;
        }
    }

    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public static void main(String[] args) {
        insertLast(10);
        insertLast(11);
        insertLast(12);
        display(first);
    }
}