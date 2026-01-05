//Duplicate removal from LL
public class q6 {
    public static void main(String[] args) {
        Node first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(30);
        Node six = new Node(50);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;

        Node p = first;
        while(p != null){
            Node curr = p;
            while(curr.next != null){
                if(curr.next.data == p.data){
                    curr.next = curr.next.next;
                }else{
                    curr = curr.next;
                }
            }
            p = p.next;
        }
        Node temp = first;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}