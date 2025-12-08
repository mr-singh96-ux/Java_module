// This program converts infix expressions to postfix form using a stack.
// Operands go directly to the postfix string, while operators are managed by precedence rules.
// After scanning all symbols, remaining stack operators are added to complete the postfix expression.
package Stacks;

class stack{
    int size;
    char[] arr;
    int top;

    stack(int size){
        this.size = size;
        arr = new char[size];
        top = -1;
    }

    void push(char x){
        if(isFull()){
            System.out.println("Stack full");
        }
        else{
            arr[++top] = x;
        }
    }

    char pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        return arr[top--];
    }

    char stackTop(){
        if(isEmpty()){
            return '\0';
        }else{
            char c = arr[top];
            return c;
        }
    }

    boolean isFull(){
        return top == size-1;
    }

    boolean isEmpty(){
        return top == -1;
    }
}

public class infixPostfix{

    static String convert(String s){
        stack s1 = new stack(s.length());
        char[] postfix = new char[s.length()];
        int i = 0, j = 0;
        while(i<s.length()){
            
            char c = s.charAt(i);
            
            if(isOperand(c)){
                postfix[j++] = c;
                i++;
            }
            
            else{
                while(!s1.isEmpty() && Pre(c)<=Pre(s1.stackTop())){
                    postfix[j++] = s1.pop();
                }
                s1.push(c);
                i++;
            }
        }
        while (!s1.isEmpty()) {
            postfix[j++] = s1.pop();
        }
        return new String(postfix, 0, j);
    }

    static boolean isOperand(char c){
        if(c=='+' || c=='-' || c=='*' || c=='/') return false;
        return true;
    }

    static int Pre(char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='*' || c=='/') return 2;
        return 0;
    }
    public static void main(String[] args) {
        String n = "6+3-(4-5)+2";
        System.out.println(convert(n));
    }
}