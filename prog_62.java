import java.util.*;
interface fare {
    void getAmmount(int Amm);
}
class bus implements fare{

    @Override
    public void getAmmount(int Amm) {
       System.out.println("Fare by bus :"+Amm*1);
    }
    
}
class train implements fare{

    @Override
    public void getAmmount(int Amm) {
      System.out.println("fare by train :"+Amm*2);
    }
    
}
public class prog_62 {
    public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int am1 , am2;
    System.out.println("Enter fare by bus :");
    am1 = sc.nextInt();
    System.out.println("Enter fare by train :");
    am2=sc.nextInt();

    bus s = new bus();
    s.getAmmount(am1);

    train t = new train();
    t.getAmmount(am2);
    }
}
