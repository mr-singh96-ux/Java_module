package Classes;

class Student1{
    String name;
    int age;

    void display(){
        System.out.println("Name: "+name+" Age: "+age);
    }
} 

public class Student {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.name="Kiratbir Singh";
        s.age=20;
        s.display();
    }
    
}
