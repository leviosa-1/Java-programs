public class prog_100 {
    public static void main (String args[]){
        String str = "Hello world, how are you?";
        String[] words = str.split("\\s+");
        String reversed = "";
        
        for (int i = words.length - 1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        
        System.out.println("Original string: " + str);
        System.out.println("Reversed string: " + reversed.trim());
    }
}

