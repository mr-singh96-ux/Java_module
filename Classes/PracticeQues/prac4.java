// Write a program to create a class Student that can be initialized with or without parameters. Also create a copy of a student object using a copy constructor.
package Classes.PracticeQues;

class Student{
    String name;
    int age;
    long roll_no;
    Student(){
        name = "null";
        age = 0;
        roll_no = 0;
    }

    Student(String n, int a, long r){
        name = n;
        age = a;
        roll_no = r;
    }

    Student(Student s){
        name = s.name;
        age= s.age;
        roll_no = s.roll_no;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Roll No: "+roll_no);
    }
}

public class prac4{
    public static void main(String[] args) {
        Student s1 = new Student();
        // s1.name = "Null";
        // s1.age = 0;
        // s1.roll_no = 0;
        Student s2 = new Student("Kiratbior Singh", 20, 383);
        Student s3 = new Student(s2);
        s1.display();
        s2.display();
        s3.display();
    }
}