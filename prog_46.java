import java.util.*;
public class prog_46{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a, b, c;
      System.out.println("Enter the # values to get sum , produt , average , min/max ");
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      double avg ;
      avg = (a+b+c)/3;
      int smallest = a;
      int largest = a;
      if (b < smallest) {
          smallest = b;
      }
      if (b > largest) {
          largest = b;
      }
      if (c < smallest) {
          smallest = c;
      }
      if (c > largest) {
          largest = c;
      }
      System.out.println("Sum :"+(a+b+c));
      System.out.println("Product :"+(a*b*c));
      System.out.println("Average :"+avg);
      System.out.println("Smallest :"+smallest);
      System.out.println("Largest :"+largest);
    }
    
}