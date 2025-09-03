//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Left rotate an array by one place

        int arr[] = {1,2,3,4,5,6};

        int temp = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;




        int brr[] = {1,2,3,4,5,6};
        rotatebykplace(brr,3);

        for(int i=0;i<arr.length;i++)
        {
            System.out.println(brr[i]);
        }


    }

    public static void rotatebykplace(int arr[],int k)
    {

        int n = arr.length;
        k=k%n;
        int brr[] =  new int[n];

        int j=0;
        for(int i=k;i<n;i++)
        {

            brr[j++]=arr[i];
        }

        for(int i=0;i<k;i++)
        {

            arr[k+i]=arr[i];
        }



        for(int i=0;i<k;i++)
        {
            arr[i]=brr[i];
        }

    }


}