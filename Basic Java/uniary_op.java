import java.util.*;
public class uniary_op {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Pre-Increment: " + (++a));
        System.out.println("Post-Increment: " + (a++));
        System.out.println("Pre-Decrement: " + (--a));
        System.out.println("Post-Decrement: " + (a--));
    }
}
