// This program shows how to implement a stack using an array.
// It creates a stack with size, top pointer, and a dynamic array.
// Then we perform basic stack operations like push and pop.

package Stacks;

class Stack1{
    int size;
    int[] arr;
    int top;

    Stack1(int size){
        this.size = size;
        arr = new int[size];
        top = -1;
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[++top] = val;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
          return arr[top--];
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }else{
            return arr[top];
        }
    }

    boolean isFull(){
        return top == size-1;
    }

    boolean isEmpty(){
        return top == -1;
    }

    void display(){
    for(int i=0; i<=top; i++){
        System.out.print(arr[i]+ " ");
    }
    System.out.println();
}
}

public class stackUsingArray {
    public static void main(String[] args) {
    Stack1 s = new Stack1(5);
    s.push(10);
    s.push(20);
    System.out.println("Peek: "+s.peek());
    System.out.println("Poped: "+s.pop());
    s.display();
    }
}
