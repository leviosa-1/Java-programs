import java.util.*;
public class name {
    public static void main(String args[]){
          Scanner sc= new Scanner(System.in);
          int n = sc.nextInt();
          String[] name = new String[n];
    //input
          for(int i=0; i<n; i++){
            name[i] = sc.next();
          }
    //output
    System.out.println("my name is :");
       for(int i=0; i<name.length; i++){
        System.out.print(name[i]+ " ");
       }

    }
}
