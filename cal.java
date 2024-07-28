import java.util.*;
public class cal {
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Substraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");
        System.out.println("5. Modulo");
        System.out.println("6. Exit");
        System.out.println("enter your choice");
        int choice = sc. nextInt();

        switch(choice){
            case 1 : System.out.println("Addition=");
                     System.out.println(a+b);
                     break;
            case 2 : System.out.println("Substraction");
                     System.out.println(a-b);
                     break;
            case 3 : System.out.println("Division");
                     System.out.println(a/b);
                     break;
            case 4 : System.out.println("Multiplication");
                     System.out.println(a*b);
                     break;
            case 5 : System.out.println("modulo");
                     System.out.println(a%b);
                     break;
            default: System.out.println("invalid choice!!");
                     break;

        }

       
    }
    

        
}

