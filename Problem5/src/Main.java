//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int nums[] = {3,0,2,1,5};
        System.out.println(missingNumber(nums));

    }


        public static int missingNumber(int[] nums) {

            int n = nums.length;

            int sum = 0;
            int totalsum = (n*(n+1))/2;

            for(int i=0;i<n;i++)
            {
                sum+=nums[i];
            }

            return totalsum - sum;
        }



}