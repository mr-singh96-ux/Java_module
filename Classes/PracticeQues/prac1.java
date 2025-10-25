//Create a class Employee using this keyword and constructor overloading

package Classes.PracticeQues;

class Employee{
    String name;
    double salary;

    Employee(){
        this("Kiratbir Singh",9000000.0);
    }

    Employee(String n, double s){
        name = n;
        salary = s;
    }

    void display(){
        System.out.println("Name: "+name+" Salary: "+salary);
    }
}

public class prac1{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}