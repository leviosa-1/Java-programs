public class ComLine {
    public static void main(String args[]){
        int count , i=0;
        String name;
        count = args.length;
        System.out.println("Number of arguments :"+count);
        while(i<count)
        {
            name = args[i];
           System.out.println((i+1)+ ": Java is "+name+"!!");
           i=i+1;
        }
    }
}
