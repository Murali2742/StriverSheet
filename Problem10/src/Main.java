public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        int[] nums = {1, 1, 0, 1, 1, 1};
        System.out.println(obj.findMaxConsecutiveOnes(nums)); // Output: 3
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int count = 0;

        for (int num : nums) {
            if (num == 1) {
                count++;
                max = Math.max(max, count); // update max here
            } else {
                count = 0; // reset on 0
            }
        }

        return max;
    }
}
