import java.util.*;
class Rectangle{
    float length,breadth;
    Rectangle(int l, int b){
        length=l;
        breadth=b;
    }
     void rectArea(){
        System.out.println("Area of rectangle = "+length*breadth);
    }
}
public class RectArea {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int l, b;
    System.out.println("enter length and Breadth");
    l=sc.nextInt();
    b=sc.nextInt();
    Rectangle r= new Rectangle(l,b);
    r.rectArea();
    }
}
