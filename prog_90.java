import java.io.File;
public class prog_90 {
    public static void main (String args[]){
     File myFile = new File("sac.txt");
    if(myFile.delete()) 
        System.out.println(myFile.getName()+" Deleted sucessfully");
    else
       System.out.println("Some error occured while deleting the file");

    }
}
