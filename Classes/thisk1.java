package Classes;

class Key{
    String name;

    Key(){
        this("Kiratbir Singh");
    }

    Key(String n){
        name = n;
    }

    void display(){
        System.out.println("Name: " + name);
    }
}

public class thisk1{
    public static void main(String[] args) {
        Key k  = new Key();
        k.display();
    }
}