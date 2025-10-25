package Classes;

class Student{
    String name;
    int age;

    Student(){
        name = "Kiratbir Singh";
        age = 0;
    }
    Student(String n){
        name = n;
    }

    Student(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
}

public class constOver{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("HarshDeep Singh");
        Student s3 = new Student("Harsh", 19);
        s1.display();
        s2.display();
        s3.display();

    }
}