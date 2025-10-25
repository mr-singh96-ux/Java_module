import java.util.*;

public class aplha_check {
    public static void main(String[] args) {
        char c;
        Scanner sc = new Scanner(System.in);
        c = sc.next().charAt(0);
        if((c>='A' && c<='Z') || (c>='a' && c<='z')){
            if(c>='A' && c<='Z'){
                System.out.println("Is Uppercase");
            }
            else{
                System.out.println("Is Lowercase");
            }
        }
        else{
            System.out.println("Not an aplhabet");
        }
    }
}
