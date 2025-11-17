// Write a class that supports:
// push(x)
// pop()
// peek()
// isEmpty()

class Stack{
    int top;
    int[] arr;
    int size;
    Stack(int size){
        top = -1;
        this.size = size;
        arr = new int[size];
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = val;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top--];
    }

    int peek(){
        return arr[top];
    }

    void display(){
        for(int i=0; i<=top; i++){
            System.out.println(arr[i] + " ");
        }
    }
    boolean isFull(){
        return top == size-1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class q1{
    public static void main(String[] args) {
        Stack s  = new Stack(10);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.display();
        s.pop();
        s.pop();
        s.display();
    }
}