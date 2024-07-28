// prog 47 48 
import java.util.*;
class calculation {
    void circleArea(double radius){
        System.out.println("Area of circle :"+(3.14*radius*radius));
    }
    void cieclePerimeter(double radius){
        System.out.println("Circumfranvce of circle :"+(2*3.14*radius));
    }
}
public class prog_47 {
    public static void main (String args[]){
    Scanner sc = new Scanner (System.in);
    double r ;
    System.out.println("enter the radius of circle :");
    r=sc.nextDouble();
    calculation cal = new calculation();
    cal.circleArea(r);
    cal.cieclePerimeter(r);

    }
}
