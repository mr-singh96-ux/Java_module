// This program verifies balanced brackets in an expression using a stack.
// It supports round (), square [], and curly {} brackets.
// Opening brackets are pushed into the stack; closing brackets must match the top.
// If all symbols match and the stack becomes empty, the expression is balanced.
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

    char pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return '\0';
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

public class parenthesisCheckAdvanced{
    static boolean isBalance(String s){
        
        Stacka s1 = new Stacka(s.length());
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='['){
            s1.push(ch);
        }            
            else if(ch == ')' || ch=='}' || ch==']'){            
            if(s1.isEmpty()) return false;
            
            char c = s1.pop();
            
            if((ch == ')' && c != '(') || 
                (ch == ']' && c != '[') || 
                (ch == '}' && c != '{'))
            return false;
        }
        }
        return s1.isEmpty();
    }
    public static void main(String[] args) {
        String s = "{(Kira((1)32))}";
        System.out.println(isBalance(s));

    }
}