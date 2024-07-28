
import java.util.*;
public class avg {
    public static float avgs(int a, int b, int c){
        float e = (a+b+c)/3;
        return(e);
    }
   public static void main (String args[]){
     Scanner sc = new Scanner(System.in);
     int a,b,c;
     System.out.println("Enter the three values to get average");
     a=sc.nextInt();
     b=sc.nextInt();
     c=sc.nextInt();
    System.out.println("average of three number is "+avgs(a, b, c));

   }    
}
