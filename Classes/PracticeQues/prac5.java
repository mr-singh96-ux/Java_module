// Design a class BankAccount with private data members for account number and balance. Implement methods to deposit, withdraw, and check balance. Prevent direct access to balance.
package Classes.PracticeQues;
import java.util.Scanner;

class BankAccount{
    private long acc_num;
    private double bal;
    int deposit;
    int withdraw;

    BankAccount(long a, double b,int d, int w){
        acc_num = a;
        bal = b;
        deposit = d;
        withdraw = w;
    }
    void updateBal(){
        bal = bal+deposit;
        bal = bal-withdraw;
    }

    void display(){
        System.out.println("Account Number: "+acc_num);
        System.out.println("Balance: "+bal);
    }
}
public class prac5{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1234, 2500, 0, 1010);
        int pass;
        Scanner sc = new Scanner(System.in);
        int t= 3;
        do{
             pass = sc.nextInt();
            if(pass == 1234){
                b.updateBal();
                b.display();
                break;
            }
        }
        while(t-- >0);
    }
}