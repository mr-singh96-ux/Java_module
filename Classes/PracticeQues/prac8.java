// Write a program with a class Counter that has a static variable to count how many objects are created and a static method to display the count.
package Classes.PracticeQues;
class Counter{
    static int count = 0;
    Counter(){
        count++;
    }
    static int display(){
        return count;
    }
}

public class prac8{
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(Counter.display());
    }
}