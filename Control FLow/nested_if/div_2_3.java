import java.util.*;

public class div_2_3 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num % 2 == 0){
            if(num % 3 == 0){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }     
        }
        else{
                System.out.println("No");
            }
    }
}
