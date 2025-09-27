import java.util.*;

public class vote_eli {
    public static void main(String[] args) {    
    int age;
    Scanner sc = new Scanner(System.in);
    age = sc.nextInt();
    if( age >= 18){
        System.out.println("Person is eligible to vote");
    }
    else{
        System.out.println("Not eligible");
    }
}
}