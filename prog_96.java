import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
// code to write in file 
public class prog_96 {
    public static void main (String args[]){
        try {
            FileWriter fileWriter = new FileWriter("file.txt");
            fileWriter.write("This is my first file Handling code in java language \n by Ayush Jiaswal \n Roll Number : 'IC-2k21-22' \n Class : MCA 4th sem (2nd year) Section A");
            System.out.println("Content has been written in file");
            fileWriter.close();
        } catch (IOException e) {
           
            e.printStackTrace();
        }
        
    }
}
