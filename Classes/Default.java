package Classes;

class Const{
    String name;
    int age;
    Const(){
        name = "Kiratbir Singh";
        age = 20;
    };
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Default{
    public static void main(String[] args) {
        Const c = new Const();
        // Const c("Kiratbir Singh", 20);
        c.display();
    }
}