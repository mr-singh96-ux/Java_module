import java.util.*;
public class zero_loop{
    public static void main(String[] args) {
        int i = 1;
        int n;
        Scanner sc = new Scanner(System.in);
        
        do{
            n = sc.nextInt();
            System.out.println(n);
            
        }while(n!=0);
    }
}