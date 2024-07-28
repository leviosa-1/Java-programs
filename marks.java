import java.util.*;
public class marks {
    public static void main(String args[]){
          
           
            Scanner sc = new Scanner(System.in);
            int input ;
            do{
               int marks = sc.nextInt();
               if(marks>=90 && marks<=100)
                 System.out.println("this is good ");
                else if(marks>=60 && marks<=89)
                  System.out.println("this is also good");
                else if(marks >=0 && marks<=59)
                  System.out.println("this is also good still");
                else{
                    System.out.println("invalid!!");
                } 
                System.out.println("want to continue for yes=1 and no=0");
                input=sc.nextInt(); 
            } while(input == 1);
             }  
             }           
    
    


   

