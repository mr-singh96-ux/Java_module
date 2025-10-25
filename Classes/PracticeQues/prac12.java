// Create a class ComplexNumber that supports constructor overloading and a method add() to add two complex numbers.
package Classes.PracticeQues;

class Complex{
    double real;
    double imag;
    
    Complex(double real, double imag){
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex c){
        return new Complex(this.real+c.real, this.imag+c.imag);
    }

    void cal(){
        System.out.println(real+" + "+imag + " i ");
    }
}
public class prac12{
    public static void main(String[] args) {
        Complex c1 = new Complex(1.5, 2.8);
        Complex c2 = new Complex(1.8, 8.9);
        Complex sum = c1.add(c2);
        sum.cal();
    }
} 