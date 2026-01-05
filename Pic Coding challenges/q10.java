//Palindrome a list
public class q10 {
    public static void main(String[] args) {
         Node first = new Node(10);
        Node second = new Node(10);
        Node third = new Node(20);
        Node fourth = new Node(30);
        Node fifth = new Node(10);
        Node six = new Node(10);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;

        Node newHead = new Node(0);
        Node tail = newHead;
        
        Node head = new Node(0);
        Node tail1 = head;
        Node a = first;
        while(a!=null){
            tail1.next = new Node(a.data);
            tail1 = tail1.next;
            a = a.next;
        }
        head = head.next;
        Node p = first;
        Node q = null;
        Node r = null;

        while(p != null){
            r = q;
            q = p;
            p=p.next;
            q.next = r;
        }
        tail.next = q;

        Node new1 = newHead.next;
        Node new2 = head;
        boolean pal = true;
        while(new2!=null && new1!=null){
            if(new2.data!=new1.data){
                pal = false;
            }
            new2 = new2.next;
            new1 = new1.next;
        }

        if(pal) System.out.println("Yes");
        else System.out.println("No");
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