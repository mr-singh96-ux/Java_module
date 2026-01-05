//Find special employee

public class q9 {
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
        six.next = fourth;

        
        Node slow = first;
        Node fast = first;
        Node special = null;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                special = slow;
                break;
            }
        }

        Node start = first;
        while(start!=special){
            start=start.next;
            special=special.next;
        }
        System.out.println(start.data);
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
