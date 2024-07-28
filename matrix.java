
import java.util.*;
public class matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int row, col, x;
        System.out.println("enter the row and coloumn respectively:");
        row = sc.nextInt();
        col = sc.nextInt();
        int[][] matrix =new int[row][col];
        System.out.println("enter the elements:");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("entered matrix is follows :");
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        } 
        System.out.println("enter X to to find in matrix: ");
        x=sc.nextInt();
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j]==x){
                    System.out.println("element found at index " +i+ "and " +j) ;
                    break;
                }
            
            }
        }


    }
}
