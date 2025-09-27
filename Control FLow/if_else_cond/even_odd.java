import java.util.*;

public class even_odd {
    public static void main(String[] args) {
        int number;
        Scanner sc =new Scanner(System.in);
        number =  sc.nextInt();
        if(number % 2 == 0){
            System.out.println(number + " is even integer!");
        }
        else{
            System.out.println(number + " is an odd integer!");
        }
    }    
}
