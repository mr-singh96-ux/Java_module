// add two numbers from two linked list
import java.util.*;
// package CodingChallengesQues.ExtraCodingQues;

class Result{
    static Node addListNumbers(Node head1, Node head2){
        Node temp1 = head1;
        Node temp2 = head2;
        Node dummy = new Node(0);
        Node curr = dummy;
        int carry = 0;
        while(temp1 != null || temp2!=null || carry!=0){
            int sum = carry;
            if(temp1!=null){
                sum+=temp1.data;
                temp1=temp1.next;
            }  
            if(temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }
            
            carry = sum/10;
            curr.next = new Node(sum%10);
            curr = curr.next;

        }
        return dummy.next;
    }
}

class Node {
  int data;
  Node next;
  Node(){}
  Node(int d) {
    data=d;
  }
}

class q4 {
  static Node insertEnd(Node head, int data) {
    Node newLink = new Node(data);
    Node last = head;
    newLink.next = null;   // link new node to NULL as it is last node
    if (head == null)  // if list is empty add in beginning.
    {
      head = newLink;
      return head;
    }
    while (last.next != null)  // Find the last node
      last = last.next;
    last.next = newLink;  // Add the node after the last node of list
    return head;
  }

  static void forwardPrint(Node head)   {
    Node current = head; // start at beginning of list
    while(current != null) // until end of list,
    {
      System.out.print(current.data + " "); // print data
      current = current.next; // move to next link
    }
  }

  public static void main(String[] args) {
    int t,n,m,x;
    Scanner s = new Scanner(System.in);
    t=Integer.parseInt(s.nextLine().trim());
    while(t>0) {
      Node head = null, head2=null, t1;
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head = insertEnd(head, m);
        n--;
      }
      n = s.nextInt();
      while(n>0) {
        m = s.nextInt();
        head2 = insertEnd(head2, m);
        n--;
      }
      t1 = Result.addListNumbers(head, head2);
      forwardPrint(t1);
      System.out.println();
      t--;
    }
  }
}