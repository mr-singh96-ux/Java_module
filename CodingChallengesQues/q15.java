// delete greater nodes then a given value
import java.util.*;

public class q15 {
    public static void main(String[] args) {
        LinkedList<Integer> head = new LinkedList<>();
        head.add(1);
        head.add(2);
        head.add(5);
        head.add(3);
        head.add(4);

        Iterator<Integer> p = head.iterator();
        int x = 3;
        while(p.hasNext()){
            int num = p.next();
            if(num>=x){
                p.remove();
            }
        }
        System.out.println(head);
        
    }
    
}
