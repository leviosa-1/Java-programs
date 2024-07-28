import java.math.BigInteger;
import java.util.*;
class student {
     String FirstName , LastName, Address, qualification;
     BigInteger contact;
     student(String fname, String lname, String Addr, String qual, BigInteger cont){
        this.FirstName=fname;
        this.LastName=lname;
        this.Address=Addr;
        this.qualification=qual;
        this.contact=cont;
     }
     public String getFirstName() {
         return FirstName;
     }
     public String getLastName() {
         return LastName;
     }
     public String getAddress() {
         return Address;
     }
     public String getQualification() {
         return qualification;
     }
     public BigInteger getContact() {
         return contact;
     }
}
class faculty extends student{
    int salary ;
    faculty(String fname, String lname, String Addr, String qual, BigInteger cont , int sal) {
        super(fname, lname, Addr, qual, cont);
        this.salary=sal;
    }
    public int getSalary() {
        return salary;
    }
}
class scholar extends student{
    String course;
    scholar(String fname, String lname, String Addr, String qual, BigInteger cont,String cour) {
        super(fname, lname, Addr, qual, cont);
       this.course=cour;
    }
    public String getCourse() {
        return course;
    }
}
public class prog_57 {
    public static void main(String args[]){
        String fname,  lname,  Addr,  qual , cour;
        BigInteger cont;
        int sal;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Full name :");
       fname=sc.next();
       lname=sc.next();
       System.out.println("enter the qualification :");
       qual=sc.next();
       System.out.println("enter the Address :");
       Addr=sc.next();
       System.out.println("enter the contect details :");
       cont=sc.nextBigInteger();
       System.out.println("enter the salary :");
       sal=sc.nextInt();
       System.out.println("Enter the course :");
       cour=sc.next();

       student s = new student(fname, lname, Addr, qual, cont);
       System.out.println("Full Name :"+s.getFirstName()+" "+s.getLastName());
       System.out.println("Address :"+s.getAddress());
       System.out.println("Contact :"+s.getContact());
       System.out.println("Qualification :"+s.getQualification());

      /* faculty fac = new faculty(fname, lname, Addr, qual, cont, sal);
       System.out.println("Full Name :"+fac.getFirstName()+" "+fac.getLastName());
       System.out.println("Address :"+fac.getAddress());
       System.out.println("Contact :"+fac.getContact());
       System.out.println("Qualification :"+fac.getQualification());
       System.out.println("Salary : "+fac.getSalary());
      */
    }
}
