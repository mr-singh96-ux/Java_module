// Implement a class Rectangle that has overloaded constructors for creating a square or a rectangle. Calculate and print area and perimeter.
package Classes.PracticeQues;

class Rectangle{
    int area(int side){
        return side*side;
    }

    int area(int length, int breadth){
        return length*breadth;
    }

    int perimeter(int side){
        return 4*side;
    }
    int perimeter(int length, int breadth){
        return 2*(length + breadth);
    }
}
public class prac6{
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println(r.area(2));
        System.out.println(r.area(2, 3));
        System.out.println(r.perimeter(3));
        System.out.println(r.perimeter(2, 3));
    }
}