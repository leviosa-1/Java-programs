import java.util.*;
public class bubble {
    public static void parray(int arr[]){
        for(int i=0; i<arr.length; i++)
          System.out.print(arr[i] + " ");
    }
    public static void main(String args[]){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the size of an array:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements of an aray:");
        for(int i=0 ; i<arr.length ; i++){
              arr[i] = sc.nextInt();
        }   
        // bubble sort.
        
        for(int i=0 ; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        parray(arr);
    }
    
}
