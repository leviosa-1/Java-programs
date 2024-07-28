import java.util.*;
class Box{
    int height, width, depth;
    Box(int h, int w, int d){
            height=h;
            width=w;
            depth=d;
    }
   int vol(){
        int v= height*width*depth;
        return v;
    }
}
class volume{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the h , w and d respectively :");
        int h= sc.nextInt();
        int w= sc.nextInt();
        int d= sc.nextInt();
           Box b = new Box(h,w,d);
        System.out.println("volume of cube is :"+b.vol());


    }
}