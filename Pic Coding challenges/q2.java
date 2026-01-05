//Stack using LL

class StackLL {

    // Node structure
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Top pointer
    Node top;

    // Constructor
    StackLL() {
        top = null;
    }

    // You will write stack operations here
    // push()
    // pop()
    // peek()
    // isEmpty()

    void push(int d){
        Node temp = new Node(d);
        temp.next = top;
        top = temp;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        int value = top.data;
        top = top.next;
        return value;
    }

    boolean isEmpty(){
        return top == null;
    }
}

public class q2 {
    public static void main(String[] args) {

        StackLL st = new StackLL();

        // Call your methods here after implementing them
        // Example:
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }
}
