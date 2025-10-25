package Strings;
import java.util.*;
public class stringBuffer{
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Kirat");
        Scanner scan = new Scanner(System.in);
        StringBuffer sb; String s;
        s = scan.nextLine();
        sb = new StringBuffer(s);
        sb.append(" Bir Singh ");
        System.out.println(sb);
        sb.insert(16, "Khalsa");
        System.out.println(sb);
        sb.replace(5, 9, "bir");
        System.out.println(sb);
        sb.delete(14, 21);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.capacity();
        System.out.println(sb);
        scan.close();
    }
}