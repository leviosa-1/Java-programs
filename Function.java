
import java.util.*;

public class Function {
 public static int Factorial(int n){
         int fact=1;
        for(int i=n; i>=1; i--)
            fact=fact*i;
        return fact;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("enter number to find its factorial");
    n=sc.nextInt();
    System.out.println("the Factorial of "+n+"is"+Factorial(n));
    
  }
}
 