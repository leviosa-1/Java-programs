class sb {
    
    static int a=3, b;
    static void m1(int x){
        System.out.println("x="+x);
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
     static{
        System.out.println("Static block initialized!!");
        b=a*4;
    }
    

public static void main(String args[]){
    sb sb1=new sb();
   sb1. m1(10);
}
}
