import java.io.File;
import java.io.IOException;
// code to create a file !!
public class prog_89 {
    public static void main(String args[]){
        File myfile = new File("file.txt");
        try {
            myfile.createNewFile();
        } 
        catch (IOException e) {
            e.printStackTrace();
            System.out.println("Unable to create a file!!!");
        }
        System.out.println(myfile.getName()+" File created sucessfully");
    }
}

