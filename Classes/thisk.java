//Variable shadowing
package Classes;

class Key{
    String name;

    Key(String n){
        this.name = n;
        //this.name is instance variable
        //n is parameter
    }

    void display(){
        System.out.println("Name: "+name);
    }
}

public class thisk{
    public static void main(String[] args){
        Key k = new Key("Kiratbir Singh");
        k.display();
    }
}