import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
public class prog_94 {
    public static void main(String args[]){
        String sourcePathString = "file.txt";
        String destPathString = ".vscode/";

        Path sourcePath = Paths.get(sourcePathString);
        Path destPath = Paths.get(destPathString);

        try {
            // Use the Files.move() method to move the file
            Files.move(sourcePath, destPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("An Error occurred");
        }
    }
}
