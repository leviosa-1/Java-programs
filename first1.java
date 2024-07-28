import java.lang.Math;
import java.util.Scanner;
class first1{
 static char val = 'w';
 static String yr = "1987";
  public static void main(String args[]){
    System.out.println("Value of char = "+val);
    System.out.println("year = "+yr);
  System.out.println("java is better than c and c++");
  Scanner sc = new Scanner(System.in);
  System.out.println("enter the number to get square root:");
  int x= sc.nextInt();
  double y;
  y= Math.sqrt(x);
  System.out.println("squre root of "+x+" is "+y);
  
}
}