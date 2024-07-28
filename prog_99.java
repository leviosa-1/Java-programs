import java.io.File;

public class prog_99 {
    public static void main (String args[]){
        File file = new File("file.txt");
        
        if (file.exists()) {
            long length = file.length();
            System.out.println("File length in bytes: " + length);
        } else {
            System.out.println("File does not exist.");
        }
        
    }
}
