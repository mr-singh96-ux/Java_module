// Delete nodes from a linked list.
package LinkedList;

class Node{
    int data;
    Node next;
}

public class DeleteNode{
    static Node first;
    static void deleteNode(int pos){
        Node q = null;
        Node p = first;
        if(pos == 1){
            p = first;
            first = first.next;
            // delete p;
        }
        else{
            // p = first;
            for(int i=0; i<pos-1 && p!=null; i++){
            q = p;
            p = p.next;
        }
        if(p!=null){
        q.next = p.next;
        // delete p;
        }
    }
    }

    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        first = new Node();
        Node last, p;
        first.data = arr[0];
        first.next = null;
        last = first;
        for(int i=1; i<5; i++){
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }
        deleteNode(3);
        display(first);
    }
}