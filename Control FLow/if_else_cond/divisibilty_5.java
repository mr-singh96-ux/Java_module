import java.util.*;

public class divisibilty_5 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if(num % 5 == 0){
            System.out.println("Divisible by 5");
        } 
        else{
            System.out.println("Not Divisible");
        }
    }
}
