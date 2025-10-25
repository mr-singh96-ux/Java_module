// Write a program to demonstrate autoboxing and unboxing with wrapper classes for int, double, and char.
package Classes.PracticeQues;
public class prac10{
    public static void main(String[] args) {
        int a = 10;
        Integer obj = a;
        int b = obj;

        double c = 11;
        Double obj1 = c;
        double d = obj1;

        char e = 'k';
        Character obj2 = e;
        char f = obj2;

        System.out.println(b);
        System.out.println(obj);
        System.out.println(d);
        System.out.println(obj1);
        System.out.println(f);
        System.out.println(obj2);
    }
}