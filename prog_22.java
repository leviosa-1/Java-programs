import java.util.*;
class prog_22{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the size of an array ");
        n= sc.nextInt();
        int arr[]= new int[n];
        int l,u,m,key,c=0,found=0;
        System.out.println("Enter the elements of an array");
        for(int i=0;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the element you want to find");
        key=sc.nextInt();
        // binary search \
        l=0; u=n;
        while(l<=u && found==0){
            m=(l+u)/2;
            if(arr[m]==key)
              found=1;
            else if(key>=m)
              l=m+1;
            else if(key<=m)
              u=m-1;
            else 
              found=1;
            c++;
        }
        System.out.println("Ittrations:"+c);
        if(found==1)
         System.out.println("element is found");
        else
          System.out.println("element not found");

    }
}