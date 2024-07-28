import java.util.*;
interface Vehical {
    void getColor(String color);
    void getNumber(String num);
    void getConsumption(int cons);
}
class twoWheeler implements Vehical{

    @Override
    public void getColor(String color) {
        System.out.println("colour of two wheeler :"+color);
    }

    @Override
    public void getNumber(String num) {
       System.out.println("Number of Two Wheeler :"+num);
    }

    @Override
    public void getConsumption(int cons) {
       System.out.println("Consumption of fule in two Wheele :"+cons/2);
    }
}
class fourWheeler implements Vehical{

    @Override
    public void getColor(String color) {
       System.out.println("Color of four Wheeler :"+color);
    }

    @Override
    public void getNumber(String num) {
        System.out.println("Number of foue Wheeler :"+num);
    }

    @Override
    public void getConsumption(int cons) {
       System.out.println("Consumption of fule in four Wheeler :"+cons/4);
    }
    
}
public class prog_61 {
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    String c1,c2,num1,num2;
    int cons1,cons2;
    System.out.println("Enter the colour of 2-wheeler and 4-wheeler respectively :");
    c1=sc.nextLine();
    c2=sc.nextLine();
    System.out.println("Enter the number of 2-wheeler and 4-wheeler respectively :");
    num1=sc.nextLine();
    num2=sc.nextLine();
    System.out.println("Enter the Consumption of 2-wheeler and 4-wheeler respectively :");
    cons1=sc.nextInt();
    cons2=sc.nextInt();

    // 2-wheeler
    twoWheeler tw = new twoWheeler();
    tw.getColor(c1);
    tw.getNumber(num1);
    tw.getConsumption(cons1);

    //4-wheeler
    fourWheeler fw = new fourWheeler();
    fw.getColor(c2);
    fw.getNumber(num2);
    fw.getConsumption(cons2);
    }
}
