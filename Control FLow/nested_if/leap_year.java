import java.util.*;
public class leap_year {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if(year % 4 == 0){
            if(year % 100 != 0){
                System.out.println("Yes");
            }
            else if(year % 400 == 0){
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
