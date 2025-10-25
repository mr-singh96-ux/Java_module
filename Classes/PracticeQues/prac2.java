//Write a program using method overloading to find area of square and rectangle.

package Classes.PracticeQues;

class Cal{
    double area(double side){
        return side*side;
    }

    double area(double length, double breadth){
        return length*breadth;
    }
}

public class prac2{
    public static void main(String[] args) {
        Cal c = new Cal();
        System.out.println(c.area(1.2));
        System.out.println(c.area(2.4, 5));
    }
}