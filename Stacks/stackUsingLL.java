// This program implements a stack using a linked list.
// Each new element is added or removed from the head (top) of the list.
// It supports basic stack operations like push, pop, and display.
package Stacks;

class Node{
    int data;
    Node next;

    // Node(int data){
    //     this.data = data;
    //     next = null;
    // }
}

class Stack1{
    private Node top;
    Stack1(){
        top = null;
    }

    void push(int val){
        Node temp = new Node();
        if(isFull()){
            System.out.println("Stack full");
            return;
        }else{
            temp.data = val;
            temp.next = top;
            top = temp;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            int popped = top.data;
            top = top.next;
            return popped;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return top.data;
        }
    }
    boolean isEmpty(){
        return top == null;
    }

    boolean isFull(){
        try{
        Node t = new Node();
        return false; //memory avaliable
    }
        catch(OutOfMemoryError e){ // memory not avaliable
            return true;
        }
    }

    void display(){
        Node p = top;
        if(!isEmpty()){
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }}else{
            System.out.println("Empty");
        }
    }
}

public class stackUsingLL{
    public static void main(String[] args) {
        Stack1 s = new Stack1();

        s.push(10);
        s.push(20);
        s.push(30);
        s.display();
        System.out.println("Peek: " + s.peek());
        System.out.println("Pooped: " + s.pop());
        s.display();
    }
}