// Write a class Person with name and age as attributes. Create methods to change the name and compare ages between two persons.
package Classes.PracticeQues;
class Person{
    String name;
    int age;
    Person(String n, int a){
        name = n;
        age = a;
    }
    void change(String n){
        this.name = n;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println();
    }
    boolean compare(Person p){
        return this.age==p.age;
    }
}
public class prac13{
    public static void main(String[] args) {
        Person p1 = new Person("kirat", 20);
        Person p2 = new Person("Harsh", 19);
        p1.display();
        p1.change("Kiratbir Singh");
        p1.display();
        p2.display();
        System.out.println(p1.compare(p2));
    }
}