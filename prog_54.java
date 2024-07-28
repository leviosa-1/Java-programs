import java.util.*;
import java.math.*;
// prog 54 55 56 
 class shape {
     private String name ;
     shape(String name){
        this.name=name;
     }
     String getName(){
        return this.name;
     }
}
class TwoDim extends shape{
     double  length;
     double  breadth;
       TwoDim(String name , double l, double b) {
        super(name);
        length=l;
        breadth=b;
    }
     public double getLength() {
         return length;
     }
     public double getBreadth() {
         return breadth;
     }
}
class Rectangle extends TwoDim{

    Rectangle(String name, double l, double b) {
        super(name, l, b);
    }
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
}
class rhoumbus extends TwoDim{
    public double side ;
    rhoumbus(String name, double l, double b,double s) {
        super(name, l, b);
        this.side=s;
    }
    public double area(){
        return (length*breadth)/2;
    }
    public double perimeter (){
        return 4*side;
    }
}
class ThreeDim extends shape{
    double length , breadth ,heigth;
    ThreeDim(String name, double l, double b, double h) {
        super(name);
        length=l;
        breadth=b;
        heigth=h;
    }
    public double getLength() {
        return length;
    }
    public double getBreadth() {
        return breadth;
    }
    public double getHeigth() {
        return heigth;
    }
}
class cuboid extends ThreeDim{

    cuboid(String name, double l, double b, double h) {
        super(name, l, b, h);
    }

    public double volume(){
        return length*breadth*heigth;
    }
    public double area(){
        return 6*(length+breadth+heigth);
    }
}
class tetrahedron extends ThreeDim{
    double side;
    tetrahedron(String name, double l, double b, double h , double s) {
        super(name, l, b, h);
        this.side=s;
    }
    public double volume(){
        return (side*side*side)/6*1.414;
    }
    public double area(){
        return 1.732*side*side;
    }
}

public class prog_54 {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double l,b,h,s;
        System.out.println("enter the l,b,h,side :");
        l=sc.nextDouble();
        b=sc.nextDouble();
        h=sc.nextDouble();
        s=sc.nextDouble();
        // rectangle
        Rectangle rec = new Rectangle("RECTANGLE", l, b);
        System.out.println("Shape :"+rec.getName());
        System.out.println("Area of "+rec.getName()+" :"+rec.area());
        System.out.println("Perimeter of "+rec.getName()+" :"+rec.perimeter());
        //rhoumbus
        rhoumbus rh = new rhoumbus("RHOUMBUS", l, b, s);
        System.out.println("Shape :"+rh.getName());
        System.out.println("Area of "+rh.getName()+" :"+rh.area());
        System.out.println("Perimeter of "+rh.getName()+" :"+rh.perimeter());
        //cuboid 
        cuboid cu = new cuboid("CUBOID", l, b, h);
        System.out.println("Shape :"+cu.getName());
        System.out.println("Area of "+cu.getName()+" :"+cu.area());
        System.out.println("Volume of "+cu.getName()+" :"+cu.volume());
        //tetrahedron
        tetrahedron tet = new tetrahedron("TETRAHEDRON", l, b, h, s);
        System.out.println("Shape :"+tet.getName());
        System.out.println("Area of "+tet.getName()+" :"+tet.area());
        System.out.println("Volume of "+tet.getName()+" :"+tet.volume());
    }
    }

