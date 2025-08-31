
public class Main {
    public static void main(String[] args) {

        //find second largest element in a array without sortinh

        int arr[] ={1,2,5,8,6};

        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {

            if(arr[i]>fmax)
            {
                smax=fmax;
                fmax=arr[i];
            } else if (arr[i] > smax && arr[i] != fmax) {
                smax = arr[i];
            }


        }
        System.out.println(smax);

    }
}