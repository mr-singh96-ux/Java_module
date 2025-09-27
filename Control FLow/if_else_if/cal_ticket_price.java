import java.util.*;
public class cal_ticket_price {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        if(age < 12){
            System.out.println("Price of ticket is: 50");
        }
        else if(age >= 12 && age <= 60){
            System.out.println("Price of ticket is: 100");
        }
        else{
            System.out.println("Price of ticket is: 160");
        }
    }
}
