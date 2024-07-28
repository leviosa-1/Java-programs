import java.io.File;

import javax.lang.model.util.ElementScanner6;
// code to file is available 
public class prog_91 {
    public static void main(String args[]){
        String path = "file.txt";
        File fileCheck = new File(path);
        if(fileCheck.exists()){
            if(fileCheck.isDirectory()){
                System.out.println("entered directory exists");
            }
            else if(fileCheck.isFile()){
                System.out.println("entered file is exists");
            }
            else
             System.out.println("entered file/directory does not exist");
        }
    }
}
