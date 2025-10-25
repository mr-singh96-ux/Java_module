import java.util.*;
public class is_vowel {
    public static void main(String[] args) {
        char vow;
        Scanner sc = new Scanner(System.in);
        vow = sc.next().charAt(0);
        if(vow=='a' || vow=='e' || vow=='i' || vow=='o' || vow=='u'){
            System.out.println(vow + " is a vowel");
        }
        else{
            System.out.println(vow + " is a Consonant");
        }
    }
}
