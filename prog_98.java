import java.io.File;

public class prog_98 {
    public static void main(String args[]){
        File fileToRename = new File("myFile.txt");
        File newFile = new File("file.txt");
        
        if (fileToRename.renameTo(newFile)) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}
