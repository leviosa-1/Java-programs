// program 51 52 
import java.util.*;
  abstract class vehical{
  private int vehical_num ;
  private int insuarance_num;
  private String color;
  public  double Consumption;
  public vehical(int vn, int inum,  String color,double Consumption){
    vehical_num=vn;
    insuarance_num=inum;
    this.color=color;
    this.Consumption=Consumption;
  }
  public String getColor() {
      return color;
  }
  public int getInsuarance_num() {
      return insuarance_num;
  }
  public int getVehical_num() {
      return vehical_num;
  }
 

  public void displayConsumption(){
    System.out.println("The Consumption of the Vehical is :"+Consumption+"km/liter");
  }
}
class TwoWheeler extends vehical{
    private double maintanance ;
    public TwoWheeler(int vn, int inum, String color, double Consumption , double maintanance) {
        super(vn, inum,color, Consumption);
        this.maintanance=maintanance;
    }
    public void maintanance(){
        System.out.println("The Maintanace of vehical is :"+maintanance);
    }
    public double average(){
     return Consumption/2;
    }
    
}
class FourWheeler extends vehical{
    private double maintanance;
    public FourWheeler(int vn, int inum, String color, double Consumption, double maintanance) {
        super(vn, inum, color, Consumption);
       this.maintanance=maintanance;
    }
    public void maintanance(){
        System.out.println("This maintanace of vehical :"+maintanance);
    }
    public double average(){
        return Consumption/4;
    }
}

    

public class prog_51{
    public static void main(String args[]){
      TwoWheeler bike = new TwoWheeler(3456, 745896, "RED", 50, 1000);
      System.out.println("Vehical Number :"+bike.getVehical_num());
      System.out.println("Color :"+bike.getColor());
      System.out.println("Insurance Number :"+bike.getInsuarance_num());
      bike.maintanance();
      System.out.println("Average :"+bike.average());

      FourWheeler car  = new FourWheeler(8966, 445896, "BLACK", 30, 2000);
      System.out.println("Vehical Number :"+car.getVehical_num());
      System.out.println("Color :"+car.getColor());
      System.out.println("Insurance Number :"+car.getInsuarance_num());
      car.maintanance();
      System.out.println("Average :"+car.average()); 
    }
}