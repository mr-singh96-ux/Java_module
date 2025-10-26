// delete the node by value

package LinkedList;

class Node{
    int data;
    Node next;
}

public class DeleteNode1{
    static Node first;
    static void deleteByvalue(int x){
        Node q = null;
        Node p = first;
        if(first.data == x){
            first = first.next;
        }
        else{
            while(p != null && p.data != x){
            q = p;
            p = p.next;
        }
        if(p != null){
            q.next = p.next;
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
        deleteByvalue(2);
        display(first);
    }
}