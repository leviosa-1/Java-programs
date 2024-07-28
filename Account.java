
import java.util.*;
// prog 41 42 43 44 
public class Account {
  static  Scanner sc = new Scanner(System.in);
    private double balance;
    Account(double bal){
        balance=bal;
    } 
    void check(double balance){
        if(balance==0.0)
          System.out.println("Account balance is zero (0.0)");     
    }
    void credit(double cr){
        balance = balance+cr;
        System.out.println("Account is credited with ammount :"+cr+"Available balance :"+balance );
    }
    double get_balance(){
        return balance;
    }
    void debit(){
        System.out.println("enter the withdrawl ammount");
        double dr = sc.nextDouble();
        if(balance<=0.0)
         System.out.println("Debit amount exceeded account balance");
        else{
            balance = balance-dr;
            System.out.println("Account is debited with ammount :"+dr+" Available Balance:"+balance);
        }
    }
    public static void main(String args[]){
        System.out.println("enter the balance of Account");
        double bal = sc.nextDouble();
        System.out.println("enter the ammount you want to credit in your account");
        double cr = sc.nextDouble();
        Account acc1 = new Account(bal);
        acc1.check(bal);
        acc1.debit();
        System.out.println("Account Balance :"+acc1.get_balance());
    }
}


