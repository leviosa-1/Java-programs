import java.util.*;
public class even_odd {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value to Check even or Odd");
        int x= sc.nextInt();
        if(x%2==0)
         System.out.println("even Number");
        else 
          System.out.println("odd Number");
    }
}
