import java.util.*;
public class empty {
    public static void main(String args[]){
     int n=4;
     int m=5;
     System.out.println("Slolid rectangle");
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
              System.out.print("* ");
        }
        System.out.println();
     }
     System.out.println("Hollow rectangle");
     for(int i=1; i<=n; i++){
        for(int j=1; j<=m;j++){
            if(i==1 || i==n || j==1  || j==m ){
              System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
     }

     System.out.println("Half peramid ...");
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
      System.out.println(" Inverted half peramid ...");
     for(int i=n;i>=1;i--){
        for(int j=i;j>=1;j--){
            System.out.print("* ");
        }
        System.out.println();
     }
     System.out.println("pyramid");
     for(int i=n;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<=n-i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }

       System.out.println("Half peramid with numbers ...");
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }

     System.out.println(" Inverted half peramid with numbwes ...");
     for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j+" ");
        }
        System.out.println();
     }
      System.out.println("floyd's triangle ...");
      int count=1;
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
     }
       System.out.println("0-1 triangle ...");
     for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print("1 ");
            }
            else{
                System.out.print("0 ");
            }
        }
        System.out.println();
     }

     // Adavance Pattern solving [problems]
     System.out.println("Butterfly Pattern");
 //upper part
 for(int i=1; i<=n; i++) {
    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }


    int spaces = 2 * (n-i);
    for(int j=1; j<=spaces; j++) {
        System.out.print("  ");
    }


    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
for(int i=n; i>=1; i--) {
    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }


    int spaces = 2 * (n-i);
    for(int j=1; j<=spaces; j++) {
        System.out.print("  ");
    }


    for(int j=1; j<=i; j++) {
        System.out.print("* ");
    }
    System.out.println();
}
   
            System.out.println("solid rhombus");
            for(int i=1; i<=n;i++){
                //spaces
                for(int j=1; j<=n-i; j++){
                    System.out.print("  ");
                }
                 for(int j=1; j<=n; j++){
                    System.out.print("* ");
                 }
                 System.out.println();
            }

            System.out.println("Number pyramid ...");
            for(int i=1; i<=n;i++){
                for(int j=1; j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=i; j++){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            System.out.println("Palindromic Pattern");
            for(int i=1; i<=n; i++){
                // spaces 
                for(int j=1; j<=n-i; j++ ){
                    System.out.print("  ");
                }
                 // numbers
                for(int j=i; j>=1; j-- ){
                    System.out.print(j+" ");
                }
                 for(int j=2; j<=i; j++){
                    System.out.print(j+" ");
                 }
                 System.out.println();
            }

                System.out.println("Dimond");
     for(int i=n;i>=1;i--){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<=n-i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }
      for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
            System.out.print(" ");
        }

        for(int j=0;j<=n-i;j++){
            System.out.print("* ");
        }
        System.out.println();
     }

    }
}
