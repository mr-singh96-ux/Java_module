package Strings;

public class pal {
    public static void main(String[] args) {
        String s1 = "Kirat"; 
        StringBuilder rev = new StringBuilder(s1);
        rev.reverse();
        if(s1.equals(rev.toString())){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    
}
