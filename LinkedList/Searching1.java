// improvement in linear search using move top the head the key element.
package LinkedList;

class Node{
    int data;
    Node next;
}

public class Searching1{
    static Node first;

    static Node Search(Node p, int key){
        Node q = null;
        while( p != null){
            if(key == p.data){
                if(q != null){
                q.next = p.next;
                p.next = first;
                first = p;
                return p;
            }
        }
            q = p;
            p = p.next;
        }
        return null;
    }
    public static void main(String[] args) {
        first = new Node();
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
        System.out.println(Search(p, 7));
        
        while(first != null){
            System.out.println(first.data);
            first = first.next;
        }
    }
}