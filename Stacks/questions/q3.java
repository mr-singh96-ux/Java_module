// Next Greater Element using Stack
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

class NextGreater{
    int[] nextG(int[] arr, int n){
    Stack s = new Stack(n);
    int[] result = new int[n];
        for(int i = n-1; i>=0; i--){
    while(!s.isEmpty() && s.peek() <= arr[i])
        s.pop();   

        if(s.isEmpty()) result[i] = -1;
        else result[i] = s.peek();

        s.push(arr[i]);
    }
        return result;
    }
}


public class q3{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        NextGreater n = new NextGreater();
        int[] result = n.nextG(arr, 5);
        for(int x : result){
            System.out.println(x);
        }
    }
}