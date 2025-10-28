// Inserting a new node before first node and after a given position.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class InsertNode{
    static Node first;
    static void Insert(int pos, int x){
        Node t,p;
        if(pos==0){
            t = new Node();
            t.data = x;
            t.next = first;
            first = t;
        }
        else if(pos > 0){
            p = first;
            for(int i = 0; i<pos-1 && p!=null; i++){
                p = p.next;
            }
            if(p != null){
                t = new Node();
                t.data = x;
                t.next = p.next;
                p.next = t;
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    
    public static void main(String[] args) {
        first = new Node();
        int[] arr = {1,2,3,4,5};
        Node last, p;
        first.data = arr[0];
        first.next = null;
        last = first;
        for(int i = 1; i < 5; i++){
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }

        Insert(0, 10);
        Insert(4, 11);
        Insert(2, 12);
        p = first;
        display(p);
    }
}