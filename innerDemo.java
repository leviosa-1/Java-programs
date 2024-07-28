class outer{
    int outer_x =10;
    void test (){
        Inner inner= new Inner();
        inner.display();
    }
    class Inner{
        void display(){
            System.out.println("display Oter var by inner class method:"+outer_x);
        }
    }
}
public class innerDemo {
 public static void main(String [] args){
    outer o1 = new outer();
    o1.test();
 }    
}
