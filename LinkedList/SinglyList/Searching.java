//Search elements in linked list using linear search as binary search is not applicable in linked list. We will go with both looping and recursive method.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class Searching{

    static Node Search(Node p, int key){
        while(p != null){
            if(key == p.data){
                return p;
            }
            p = p.next;
        }
        return null;
    }

    static Node Search1(Node p, int key){
        if(p == null) return null;
        if(key == p.data){
            return p;
        }
        return Search(p.next, key);
    }

    public static void main(String[] args) {
        Node first = new Node();
        Node last, p;

        int[] arr = {1,2,3,4,5,6,17};

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
        System.out.println(Search(p, 17));
        System.out.println(Search1(p, 17));
    }
}