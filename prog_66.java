import java.util.*;
public class prog_66 {
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    double a,b,d;
    System.out.println("Enter the value of a and b for division (a/b) = ");
    a=sc.nextDouble();
    b=sc.nextDouble();
    try{
        d=a/b;
        System.out.println("Division :"+d);
    }
    catch(ArithmeticException e){
        System.out.println("Division by Zero is not posible !!");
    }
    }
}
