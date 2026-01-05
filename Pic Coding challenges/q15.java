//Delete node greater than specific value
public class q15 {
    public static void main(String[] args) {
         Node first = new Node(10);
        Node second = new Node(60);
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(40);
        Node six = new Node(50);


        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = null;
        while(first != null && first.data > 50){
            first = first.next;
        }
        Node p = first;
        while(p!=null && p.next!=null){
            if(p.next.data>50){
                p.next = p.next.next;
            }else{
                p = p.next;
            }
        }

        while(first != null){
            System.out.println(first.data+" ");
            first = first.next;
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
