//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        int [] nums = {0,1,0,3,12};

        int n = nums.length;
        int lp=0;
        int rp=0;
        int temp=0;
        for(int i =0;i<n;i++)
        {
            if(nums[rp]!=0)
            {
                temp=nums[rp];
                nums[rp]=nums[lp];
                nums[lp]=temp;

                lp++;

            }
            rp++;

        }

        for(int i:nums)
        {
            System.out.println(i);
        }

    }
}