// Write a program to demonstrate how a static method can be called without creating an object, and how instance methods require an object.
package Classes.PracticeQues;
class Gen{
    static void display(){
        System.out.println("Kiratbir Singh");
    }
}
public class prac14{
    public static void main(String[] args) {
        Gen.display();
    }
}