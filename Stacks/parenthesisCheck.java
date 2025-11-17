// This program performs parenthesis matching using a stack.
// Opening brackets are pushed into the stack, and closing brackets remove the top.
// If every symbol matches correctly and the stack becomes empty at the end,
// the expression is balanced.
package Stacks;

class Stacka{
    int size;
    int top;
    char[] arr;

    Stacka(int size){
        this.size = size;
        top = -1;
        arr = new char[size];
    }

    void push(char val){
        if(isFull())
        { System.out.println("Stack Overflow");
         return;}
        arr[++top] = val;
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return -1;
        }
        return arr[top--];   
    }

    boolean isFull(){
        return top == size-1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class parenthesisCheck{
    static boolean isBalance(String s){
        
        Stacka s1 = new Stacka(s.length());
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch=='('){
            s1.push(ch);
        }
            
            else if(ch == ')'){
            
            if(s1.isEmpty()) return false;
            s1.pop();
        }
        }
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        String s = "(Kira((1)32))";
        System.out.println(isBalance(s));

    }
}