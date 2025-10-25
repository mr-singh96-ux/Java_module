import java.util.*;
public class pass {
    public static void main(String[] args) {
        String pass;
        Scanner sc = new Scanner(System.in);
        while(true){
            pass = sc.next();
            System.out.println(pass);
            if(pass.equals("admin123")){
                break;
            }
        }
    }
    
}
