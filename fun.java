import java.util.Scanner;

public class fun {
    public static int factorial(int n){
        int fact=1;
        for(int i=1; i<=n; i++){
            fact=fact*i;      
        }
        return fact;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n !!!");
        int n = sc.nextInt();
        int factorial = factorial(n);
        System.out.println("factorial of "+n+" is "+factorial);
    }
}
