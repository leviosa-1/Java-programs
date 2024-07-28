import java.util.*;
class first
{  public static void main(String args[]) 
    {
        Scanner sc= new Scanner(System.in);
       int n , i ;
       System.out.println("enter the value of n");
       n = sc.nextInt();
       System.out.println(" even numbers till N  are as follows:");
       for(i=1; i<=n; i++){
          if(i%2==0){
            System.out.println(i);
          }
       }
       

    }
}