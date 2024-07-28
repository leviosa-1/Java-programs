import java.util.*;
// program 49 50 
 class Employee {
    private String Fname ;
    private String lname;
    Employee(String F , String l){
        this.Fname=F;
        this.lname=l;
    }
    public String getFname() {
        return Fname;
    }
    public String getLname() {
        return lname;
    }
}
 class ContractEmployee extends Employee{
    private String  dep;
    private String desig;
    ContractEmployee(String F, String l ,String Dep , String Desig) {
        super(F, l);
        dep=Dep;
        desig=Desig;
    }
    public String getDep() {
        return dep;
    }
    public String getDesig() {
        return desig;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    } 
    public void displayFullName(){
        System.out.println("Full Name :"+getFname()+getLname());
    }
}
class HourlyEmployee extends ContractEmployee{
    private int numHr;
    private double WagesPerHr;
    HourlyEmployee(String F, String l, String Dep, String Desig , int numHr, double WagesPerHr) {
        super(F, l, Dep, Desig);
        this.numHr=numHr;
        this.WagesPerHr=WagesPerHr;
    }
   @Override
   public String getDesig() {
       return super.getDesig();
   }
   @Override
   public String getDep() {
       return super.getDep();
   }
   public double calWages(){
    return numHr*WagesPerHr*28;
   }
}
class WeeklyEmployee extends ContractEmployee{
    private int numWeeks ;
    private double wagesPerWeek;
    WeeklyEmployee(String F, String l, String Dep, String Desig, int numWeeks, double wagesPerWeek){
        super(F, l, Dep, Desig);
        this.numWeeks=numWeeks;
        this.wagesPerWeek=wagesPerWeek;
    }
    @Override
    public String getDesig() {
        
        return super.getDesig();
    }
    @Override
    public String getDep() {
        
        return super.getDep();
    }
    public double calWages(){
        return numWeeks*wagesPerWeek;
    }

}
class RegularEmployee extends Employee{
    private String  dep;
    private String desig;
    private double salary;
    RegularEmployee(String F, String l, String Dep, String  Desig, double Sal) {
        super(F, l);
        dep=Dep;
        desig=Desig;
        salary=Sal;
    }
    public String getDep() {
        return dep;
    }
    public String getDesig() {
        return desig;
    }
    public double getSalary() {
        return salary;
    }
   public void setDep(String dep) {
         this.dep = dep;
    }
    public void setDesig(String desig) {
        this.desig = desig;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    } 
    public void displayFullName(){
        System.out.println("Full Name :"+getFname()+getLname());
    }
}
 class prog_49 {
    public static void main (String args[]){
        Scanner sc = new Scanner (System.in);
        RegularEmployee re = new RegularEmployee("Ayush", "jaiswal", "Technical", "CTO", 150000.0);
        re.displayFullName();
        System.out.println("Department :"+re.getDep());
        System.out.println("Designation :"+re.getDesig());
        System.out.println("Salary :"+re.getSalary());
        ContractEmployee ce = new ContractEmployee("Anurag", "Solanki", "Managment", "Manager");
        ce.displayFullName();
        System.out.println("Department :"+ce.getDep());
        System.out.println("Designation :"+ce.getDesig());
        HourlyEmployee he = new HourlyEmployee("Kajal", "Bharti", "Hourly_Employee", null, 5, 100);
        he.displayFullName();
        System.out.println("Department :"+he.getDep());
        System.out.println("Designation :"+he.getDesig());
        System.out.println("Monthly Salary :"+he.calWages());
        WeeklyEmployee we = new WeeklyEmployee("Aditi", "Barod", "Weekly_Employee", null, 4, 2000);
        we.displayFullName();
        System.out.println("Department :"+we.getDep());
        System.out.println("Designation :"+we.getDesig());
        System.out.println("Monthly Salary :"+we.calWages());

    }
    
}
