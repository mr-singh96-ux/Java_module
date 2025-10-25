package Classes;

class Const{
    String name;
    int age;

    Const(String n, int a){
        name = n;
        age = a;
    }

    Const(Const s){
        name = s.name;
        age = s.age;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class CopyPara{
    public static void main(String[] args) {
        Const c1 = new Const("Kiratbir Singh", 20);
        Const c2 = new Const(c1);
        c2.display();
    }
}