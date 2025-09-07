import java.util.Scanner;
public class using_operator {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Addition: "+ (a+b));
        System.out.println("Subtraction: "+ (a-b));
        System.out.println("Multipliaction: "+ (a*b));
        System.out.println("Division:  "+ (a/b));
        System.out.println("Moduluo: " + (a%b));
    }
}