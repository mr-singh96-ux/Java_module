package Classes;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}

public class meth{
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(1,2));
        System.out.println(c1.add(1.5,2.5));
        System.out.println(c1.add(1,2,3));
    }
}