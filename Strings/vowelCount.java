package Strings;
import java.util.*;
public class vowelCount {
    public static void main(String[] args) {
        String s1;
        Scanner scan = new Scanner(System.in);
        s1 = scan.nextLine();
        int vol = 0;
        for(int i = 0; i<s1.length(); i++){
            if(s1.charAt(i)=='a' || s1.charAt(i)=='e' || s1.charAt(i)=='i' || s1.charAt(i)=='o' || s1.charAt(i)=='u'){
                vol++;
            }
        }
        System.out.println(vol);
        scan.close();
    }    
}
