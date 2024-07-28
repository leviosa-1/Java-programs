import java.util.StringTokenizer;

public class prog_101 {
    public static void main (String args[]){
        StringTokenizer st = new StringTokenizer("Hello world , How are you dear !!");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}
