//insertion in a sorted list
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}

public class InsertNode2{
    static Node first;
    static void insertSort(int x){
        Node q,p;
        q = null;
        p = first;
        while(p != null && p.data<x){
                q = p;
                p = p.next;
            }
                Node temp = new Node();
                temp.data = x;
                temp.next = p;
                q.next = temp;
        }
    static void display(Node p){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6};
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
        insertSort(3);
        p = first;
        display(p);
    }
}