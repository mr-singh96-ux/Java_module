package Classes;

class Modifier{
    private String name;
    public int age;

    void seter(String n, int a){
        name = n;
        age = a;
    }

    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}

public class Modofier{
    public static void main(String[] args) {
        String name = "Kiratbir Singh";
        int age = 20;
        Modifier m = new Modifier();
        m.seter(name, age);
        m.display();
    }
}