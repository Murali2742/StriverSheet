public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1, 2}; // Example input

        int result = singleNumber(nums);

        System.out.println("The single number is: " + result);
    }

    // Method to find the single number
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels duplicates
        }
        return result;
    }
}
