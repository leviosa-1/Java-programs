import java.util.*;
class student{
  int rnum;
  String name;
  void getNum(int n, String sname){
    rnum=n;
    name=sname;
  }
  void putNum(){
    System.out.println("Roll Number"+rnum);
    System.out.println("Name :"+sname);
  }
}
class Test extends Student{
  float phy, chem, maths;
  void getMark(float m1, float m2, float m3){
    phy=m1;
    chem=m2;
    maths=m3;
  }
  void putMarks(){
    System.out.println("Marks obtained:- ");
    System.out.println("Physics :"+phy);
    System.out.println("Chemistry :"+chem);
    System.out.println("Maths :"+maths);
  }
}
interface Sports{
  final static float sportWt = 6.0F;
  void putWt();
}
Class Result extends Test implements Sports{
  float total;
  public void putWt(){
    System.out.println("Sports Wt :"+sportWt);
}
  void display (){
    total = phy+chem+maths+sportWt;
    putNum();
    putMarks();
    putWt();
    System.out.println("Total Score :"+total);
  }
}

 class hybrid
 {
   public static void main(String args[])
   { 
     Result S1 = new Result();
     s1. getNum(1234, "Ayush Jaiswal");
     s1. getMarks(89,90.5,97.7);
     s1. display();
   }
 }
