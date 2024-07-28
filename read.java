import java.util.*;
 class read {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value of N");
      int n= sc.nextInt();
      double sum=0.0;
      for(int i=1; i<=n;i++){
        sum+=(double)1/i;
      }
      System.out.println("Sum of Harmoic Serise is :"+sum);
       
      System.out.println("price connvert");
     System.out.println("enter price");
     float price = sc.nextFloat();
     System.out.println("price :"+price*100+"paisa");

     System.out.println("temprature convert");
     System.out.println("Enter temp in Fahrenheit :");
     double F = sc.nextDouble();
     //conversion
     double c;
     c = (F-32)/1.8;
     System.out.println("Temp in Celsius :"+c);


     }   
  
}
