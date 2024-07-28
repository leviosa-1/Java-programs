import java.util.*;

public class st {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the size of the mixed array and create it
        int n = sc.nextInt();
        Object[] mixedArray = new Object[n];

        // Read the elements of the mixed array (can be integers or strings)
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                mixedArray[i] = sc.nextInt();
            } else {
                mixedArray[i] = sc.next();
            }
        }

        // Call the printMixedArray method to print all elements of the mixed array
        printMixedArray(mixedArray);

        sc.close();
    }

    // Method to print all elements of the mixed array
    public static void printMixedArray(Object[] arr) {
        for (Object element : arr) {
            System.out.println(element);
        }
    }
}

