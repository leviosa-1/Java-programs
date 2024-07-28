import java.util.*;
public class prog_103 extends Thread {
    public void run(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            
            try {
                Thread.sleep(1000); // sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread runs 10 times with a sleep of 1 second");
    }
    public static void main (String args[]){
       new prog_103().start();
    }
}
