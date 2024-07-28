import java.io.File;
import java.util.*;

public class prog_92 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String path = "file.txt";
        File fileCheck = new File(path);
        if(fileCheck.exists()){
            if(fileCheck.isFile()){
                System.out.println("Entered path is file");
            }
            else if(fileCheck.isDirectory()){
                System.out.println("Entered path is directory");
            }
            else
              System.out.println("Enterd path is not found");
        }
    }
}
