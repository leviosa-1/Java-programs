import java.math.BigInteger;
import java.util.*;
interface studentFees{
    void getAmmount(double amm);
    void getFullName(String fname, String lname);
    void getAddress(String Addr);
    void getContact(BigInteger cont);
}
class hosteler implements studentFees
{

    @Override
    public void getAmmount(double amm) {
         System.out.println("Ammount paid by Hosteler :"+(amm+1500.852));       
    }
 
    @Override
    public void getFullName(String fname, String lname) {
    System.out.println("Hosteler's Full Name :"+fname+" "+lname);    
    }

    @Override
    public void getAddress(String Addr) {
        System.out.println("Hosteler's Address :"+Addr);
    }

    @Override
    public void getContact(BigInteger cont) {
        System.out.println("Hosteler's Contact Details :"+cont);
    }
}
class nonHosteler implements studentFees{

    @Override
    public void getAmmount(double amm) {
        System.out.println("Ammount Paod by Non-hosteler :"+(amm+100.521));
    }

    @Override
    public void getFullName(String fname, String lname) {
       System.out.println("Full Name of Non Hosteler :"+fname+" "+lname);
    }

    @Override
    public void getAddress(String Addr) {
        System.out.println("Address of Non-Hosteler :"+Addr);
    }

    @Override
    public void getContact(BigInteger cont) {
        System.out.println("Contact details Non-hosteler :"+cont);
    }
    
}
public class prog_63 {
    public static void main (String args[]){
      Scanner sc = new Scanner (System.in);
      String f1,f2,l1,l2,add1,add2;
      BigInteger cont1,cont2;
      double amm1,amm2;

      System.out.println("Enter the details of Hostelers :");
      System.out.println("Full Name , Address , ammount , Contact details respectively");
      f1=sc.next();
      l1=sc.next();
      add1=sc.next();
      amm1=sc.nextDouble();
      cont1=sc.nextBigInteger();
      System.out.println("Enter the details of  Non-Hostelers :");
      System.out.println("Full Name , Address , ammount , Contact details respectively");
      f2=sc.next();
      l2=sc.next();
      add2=sc.next();
      amm2=sc.nextDouble();
      cont2=sc.nextBigInteger();

      hosteler h = new hosteler();
      h.getFullName(f1, l1);
      h.getAddress(add1);
      h.getAmmount(amm1);
      h.getContact(cont1);
      
      nonHosteler nh = new nonHosteler();
      nh.getFullName(f2, l2);
      nh.getAddress(add2);
      nh.getAmmount(amm2);
      nh.getContact(cont2);
      
    }
}
