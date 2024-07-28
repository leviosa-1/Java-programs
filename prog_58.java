abstract class shape {
    public abstract double getArea();
    public abstract double getVolume();
}
class Square extends shape{
    private double side;
    Square(double side){
        this.side=side;
    }
    public double getArea() {
        return side * side;
    }
    public double getVolume() {
        return 0.0;
    }
}
class Circle extends shape{
    private double radius;
    Circle(double r){
        radius = r;
    }
    public double getArea(){
        return Math.PI*radius*radius;
    }
    public double getVolume(){
        return 0.0;
    }
}
class Cube extends shape{
    private double side;
    Cube(double side){
        this.side=side;
    }

    @Override
    public double getArea() {
      return 6*side*side;
    }

    @Override
    public double getVolume() {
       return side*side*side;
    }
    
}
public class prog_58 {
    public static void main(String args[]){
        Square s = new Square(5.0);
        System.out.println("Area of Square :"+s.getArea());
        
        Circle c= new Circle(8.2);
        System.out.println("Area of Circle :"+c.getArea());

        Cube cu = new Cube(7.0);
        System.out.println("Area of Cube :"+cu.getArea());
        System.out.println("Volume of Cube :"+cu.getVolume());
    }
}
