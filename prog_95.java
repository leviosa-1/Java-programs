import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.StringTokenizer;
// code to read from file 
public class prog_95 {
    public static void main (String args[]){
    File myFile = new File("file.txt");
    
    Scanner sc;
    try {
        sc = new Scanner(myFile);
        while (sc.hasNextLine()){
            String line = sc.nextLine();
            StringTokenizer st = new StringTokenizer(line);
            while(st.hasMoreTokens()){
                System.out.println(st.nextToken());
            }
            System.out.println(line);
        
        }

        sc.close();
    }
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
    }
}

