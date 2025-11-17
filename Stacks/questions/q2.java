// Reverse a String using Custom Stack
import java.util.*;

class Stack{
    int top;
    char[] arr;
    int size;

    Stack(int size){
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    void push(char c){
        if(isFull()) {
            System.out.println("Stack is full");
            return;
        }
        arr[++top] = c;
    }

    char pop(){
        return arr[top--];
    }

    boolean isFull(){
        return top == size-1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}

    class Rev{
        String revS(String s1){
        Stack s = new Stack(10);
        // String s1 = "Kirat";
        for(char c : s1.toCharArray()){
            s.push(c);
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        return sb.toString();
    }
}
public class q2{
    public static void main(String[] args) {
       Rev r = new Rev();
       String result = r.revS("Kirat");
       System.out.println(result); 
    }
}