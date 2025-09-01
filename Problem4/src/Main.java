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


        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }


    }
}