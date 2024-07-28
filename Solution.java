import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        // Convert both strings to lowercase to make the comparison case-insensitive
        a = a.toLowerCase();
        b = b.toLowerCase();

        // Create HashMaps to store character frequencies for both strings
        Map<Character, Integer> freqA = new HashMap<>();
        Map<Character, Integer> freqB = new HashMap<>();

        // Calculate character frequencies for string a
        for (char c : a.toCharArray()) {
            freqA.put(c, freqA.getOrDefault(c, 0) + 1);
        }

        // Calculate character frequencies for string b
        for (char c : b.toCharArray()) {
            freqB.put(c, freqB.getOrDefault(c, 0) + 1);
        }

        // Compare the HashMaps to check if they are anagrams
        return freqA.equals(freqB);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();

        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
