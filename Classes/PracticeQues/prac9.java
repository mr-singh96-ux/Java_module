// Define a class Car with fields for model, company, and price. Use a parameterized constructor and a method to display details. Then create multiple objects and show object initialization.
package Classes.PracticeQues;

class Car{
    String model;
    String company;
    double price;
    Car(String m, String c, double p){
        model = m;
        company = c;
        price = p;
    }
    
    void display(){
        System.out.println("Modeil: "+model);
        System.out.println("Company: "+company);
        System.out.println("Price: "+price);
    }
}

public class prac9{
    public static void main(String[] args) {
        Car c1 = new Car("Nano", "TATA", 100000);
        Car c2 = new Car("Swift", "MARUTI", 1000000);
        c1.display();
        c2.display();
    }
}