import java.util.*;
 class Figure{
   int dim1,dim2;
   Figure(int d1, int d2){
       dim1=d1; 
       dim2=d2;
}
    void area(){
      System.out.println("area not defined");
    }

}
class Rectangle extends Figure{
  Rectangle(int d1, int d2){
        super(d1,d2);    
     }
   void area(){
 System.out.println("Area of rectangle ="+dim1*dim2);   
}
}

class Triangle extends Figure{
   Triangle(int d1, int d2){
      super(d1,d2);
   }
   void area(){
    System.out.println("Area of Triangle ="+ 0.5*dim1*dim2);
   }

}
class Demo{
   public static void main(String args[]){


       Figure f = new Figure(10,20);
       Rectangle r= new Rectangle(45,52);
       Triangle t= new Triangle(80,20);
       Figure fg;
       fg=r;
       fg.area();
       fg=t;
       fg.area();
   
       
  }
}
