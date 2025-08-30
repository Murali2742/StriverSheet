import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

//Find the Largest Element in an Array
public class Main {
    public static void main(String[] args) {

        //O(N) Time Complexity
        int [] arr = {1,2,3,28,7};
        int max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        System.out.println(max);

        //using streams  , same O(N)

      int n =  Arrays.stream(arr).max().getAsInt();

      System.out.println(n);



    }
}