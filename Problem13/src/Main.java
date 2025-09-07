public class Main {
    public static void main(String[] args) {
        // Test cases
        System.out.println(largestOddNumber("52"));     // Output: "5"
        System.out.println(largestOddNumber("4206"));   // Output: ""
        System.out.println(largestOddNumber("35427"));  // Output: "35427"
    }

    public static String largestOddNumber(String num) {
        // Traverse from the end of the string
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            // Check if digit is odd
            if ((ch - '0') % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        // If no odd digit found
        return "";
    }
}
