import java.util.*;

public class Main {
    public static void main(String[] args) {
        String name;
        int rn;
        float m;
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------------");
        System.out.println("Roll No\t|\tName\t\t\t|\tMarks");
        System.out.println("-------------------------------------------------------");

        // First student
        name = sc.next();
        rn = sc.nextInt();
        m = sc.nextFloat();
        System.out.printf(rn + name + m);
        System.out.println("-------------------------------------------------------");

        // Next 3 students
        for (int i = 0; i < 3; i++) {
            name = sc.next();
            rn = sc.nextInt();
            m = sc.nextFloat();
            System.out.printf("%-10d| %-20s | %-10.2f%n", rn, name, m);
            System.out.println("-------------------------------------------------------");
        }

        // Last student
        name = sc.next();
        rn = sc.nextInt();
        m = sc.nextFloat();
        System.out.printf("%-10d| %-20s | %-10.2f%n", rn, name, m);
        System.out.println("-------------------------------------------------------");
    }
}
