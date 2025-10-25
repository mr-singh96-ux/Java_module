// Build a class Account that has multiple constructors for creating an account with default balance, specific balance, or by copying another account. Include deposit and withdraw functions.
package Classes.PracticeQues;

class Account{
    long acc;
    double bal;
    Account(){
        acc = 0;
        bal = 0;
    }
    Account(long acc, double bal){
        this.acc = acc;
        this.bal = bal;
    }

    Account(Account a){
        this.acc = a.acc;
        this.bal = a.bal;
    }

    void deposit(double amount){
        bal += amount;
    }

    void withdraw(double amount){
        bal -= amount;
    }
    void display(){
        System.out.println("Acc Number: "+acc);
        System.out.println("Balance: "+bal);
        System.out.println();
    }
}

public class prac15{
    public static void main(String[] args) {
        Account a1 = new Account();
        Account a2 = new Account(123456789, 2500);
        Account a3 = new Account(987654321, 2400);
        Account a4 = new Account(a2);
        a1.display();
        a2.display();
        a3.display();
        a4.display();

        a2.withdraw(320);
        a2.display();
        a1.deposit(4500);
        a1.display();
    }
}