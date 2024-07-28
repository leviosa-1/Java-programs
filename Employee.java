import java .util.*;
import java.util.concurrent.CountDownLatch;
// prog 37 38 39 
public class Employee {
    Scanner sc= new Scanner (System.in);
    private String  first_name;
    private String last_name;
    private double salary;
  /*  Employee(String string, String string2, double month_sal){
       this.first_name=string;
       this.last_name=string2;
       this.salary=month_sal;
    } */
    public void set_data(){
        System.out.println("Enter the first name");
        first_name=sc.next();
        System.out.println("Enter the Last name :");
        last_name=sc.next();
        System.out.println("enter the Monthly Salary");
        salary=sc.nextDouble();
    }
    public void yr_sal(){
         salary = 12*salary;
         System.out.println("Annual Pakage :"+salary);
    }
    public void get_data(){
        System.out.println("First Name :"+first_name);
        System.out.println("Last Name :"+last_name);
        System.out.println("Monthly Salary :"+salary);
        System.out.println("-------------------------------------");
    }
    public static void main(String args[]){
        Employee emp = new Employee();
        Employee emp1 = new Employee();
        emp.set_data();
        emp1.set_data();
        emp.yr_sal();
        emp.get_data();
        emp1.yr_sal();
        emp1.get_data();
    }
}
