//Tray Stack (Receive/Serve)

import java.util.*;

public class que4{
    public static void main(String[] args) {
        result r = new result();
        r.receive(10);
        r.receive(20);
        System.out.println(r.serve());
        System.out.println(r.serve());
        System.out.println(r.serve());
    }
}

class result{
    Stack<Integer> s = new Stack<>();

    void receive(int n){
        s.push(n);
    }

    int serve(){
        if(s.isEmpty()){
            return -1;
        }
        return s.pop();
    }
}