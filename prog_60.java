import java.math.BigInteger;

interface payable {
    void getAmmount(int Ammount);
}
class invoice implements payable{

    @Override
    public void getAmmount(int Ammount) {
        System.out.println("Ammount pay to the invoice :"+Ammount/2);
    }
    
}
class Employee implements payable{

    @Override
    public void getAmmount(int Ammount) {
        System.out.println("Ammount pay to the Employee :"+Ammount);
    }
    
}
public class prog_60 {
    public static void main (String args[]){
        invoice iv = new invoice();
        iv.getAmmount(150000);

        Employee emp = new Employee();
        emp.getAmmount(152000);
    }
}
