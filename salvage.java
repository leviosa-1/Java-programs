import java.util.*;
public class salvage {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float dep , pp;
    int yr;
    float sal_val;
    System.out.println("enter the depritiation:");
    dep=sc.nextFloat();
    System.out.println("Enter the Purchase Price:");
    pp=sc.nextFloat();
    System.out.println("Enter the year of services");
    yr=sc.nextInt();
    sal_val = (Float) pp - (dep*yr);
    System.out.println("Salvage Value :"+sal_val);
    }
}
