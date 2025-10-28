// recursive display of elements in forward and backward way.
package LinkedList.SinglyList;

class Node{
    int data;
    Node next;
}
public class DisplayElements2{
static void forward(Node P){
    if(P != null){
        System.out.println(P.data);
        forward(P.next);
    }
}

static void backward(Node P){
    if(P != null){
        backward(P.next);
        System.out.println(P.data);
    }
}


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Node first = new Node();
        Node last, p;
        
        p = first;
        first.data=arr[0];
        first.next=null;
        last = first;

        for(int i=1; i<5; i++){
            Node temp = new Node();
            temp.data = arr[i];
            temp.next = null;
            last.next = temp;
            last = temp;
        }
        forward(p);
        System.out.println();
        backward(p);
    }
}