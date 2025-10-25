import java.util.Scanner;
public class NewClass{
    public static void main(String[] args) {
        char ch = 'a'; // You can change this value to test other characters

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is not a vowel.");
        }
    }
}