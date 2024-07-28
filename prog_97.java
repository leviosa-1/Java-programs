import java.io.*;

public class prog_97 {
    public static void main(String args[]){
        try {
            RandomAccessFile file = new RandomAccessFile("file.txt", "rw");
              String str = file.readLine();
            int num = file.readInt();
            double dbl = file.readDouble();
            System.out.println(str);
            System.out.println(num);
            System.out.println(dbl);

            file.close();
        } 
        catch (FileNotFoundException e) {
          
            e.printStackTrace();
        } catch (IOException e) {

            e.printStackTrace();
        }
        
        
    }
}
