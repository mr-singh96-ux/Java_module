// Build a class Employee that uses the this keyword to differentiate between instance and local variables in constructors. Include a method to compare two employees’ salaries.
package Classes.PracticeQues;

class Employee{
    String name;
    double salary;
    Employee(){
        this("Harsh", 25000);
    }
    Employee(String n, double s){
        this.name = n;
        this.salary = s;
    }

    void compSal(Employee e){
        if(this.salary == e.salary){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Salary: "+salary);
    }
}

public class prac7{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Kirat", 26000);
        e1.display();
        e2.display();
        e1.compSal(e2);
    }
}