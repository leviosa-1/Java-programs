import java.sql.Connection;
import java.sql.DriverManager;

public class dbconnect {
    public static void main(String args[]){
        try{
            String url = "jdbc:mysql://localhost:3306/";
            String name = "root";
            String password = "Ayush@1510";

            Connection connection = DriverManager.getConnection(url, name, password);
            System.out.println("Connected sucessfully");


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
