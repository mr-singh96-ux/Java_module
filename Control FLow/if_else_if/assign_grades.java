import java.util.*;

public class assign_grades {
    public static void main(String[] args) {
        float marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextFloat();
        if(marks<=100 && marks>=90){
            System.out.println("A");
        }
        else if(marks<90 && marks>=75){
            System.out.println("B");
        }
        else if(marks<75 && marks>=50){
            System.out.println("C");
        }
        else{
            System.out.println("Fail");
        }
    }
}
