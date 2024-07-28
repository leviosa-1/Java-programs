import java.util.*;
public class dis {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    float u , a, t ,d;
    System.out.println("Enter initail velocity (u) :");
    u = sc.nextFloat();
    System.out.println("entee the acceleration :");
    a = sc.nextFloat();
    System.out.println("Enter the time intervel :");
    t=sc.nextFloat();
    d=u*t+(Float)(a*t*t)/2;
    System.out.println("Total distance travelled ="+d);

    }
}
