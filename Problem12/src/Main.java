
public class Main {
    public static void main(String[] args) {
        // Example input
        String s = "  hello   world  java  ";

        // Call reverseWords method
        String result = reverseWords(s);

        // Print result
        System.out.println("Reversed words: \"" + result + "\"");
    }

    // Method to reverse words in a string
    public static String reverseWords(String s) {
        // Trim extra spaces and split
        String[] words = s.trim().split("\\s+");

        // Use StringBuilder to rebuild in reverse order
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(" ");
        }

        return sb.toString();
    }
}
