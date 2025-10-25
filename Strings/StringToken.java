package Strings;
import java.util.*;
public class StringToken{
    public static void main(String[] args) {
        // StringTokenizer s1 = new StringTokenizer("Kirat Bir Singh");
        String s1;
        Scanner scan = new Scanner(System.in);
        s1 = scan.nextLine();
        StringTokenizer s2 = new StringTokenizer(s1,",");
        // while(s1.hasMoreTokens()){
        //     System.out.println(s1.nextToken());
        // }
        System.out.println(s2.countTokens());
        System.out.println(s2.nextToken());
        System.out.println(s2.hasMoreTokens());
        System.out.println(s2.hasMoreElements());
        scan.close();
    }
}