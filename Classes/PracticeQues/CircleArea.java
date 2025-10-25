// Create a class Circle with a static variable pi, instance variable radius, and a method to calculate area.
package Classes.PracticeQues;

class Circle{
    static double pi = 3.14;
    double radius;

    Circle(double r){
        radius = r;
    }

    double area(){
        return pi*radius*radius;
    }
}

public class CircleArea{
    public static void main(String[] args) {
        Circle c = new Circle(2.3);
        System.out.println(c.area());
    }
}