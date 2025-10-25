import java.util.*;
public class num_pos {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        if(num > 0) {
            System.out.println(num + " is a positive integer");
        }
    }
}
