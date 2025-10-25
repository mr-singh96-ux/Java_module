import java.util.*;

public class passed_cre {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        if(marks >= 40){
            System.out.println("Student with marks: "+marks+" is passed!");
        }
    }
}
