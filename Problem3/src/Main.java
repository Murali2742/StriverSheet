
public class Main {
    public static void main(String[] args) {


        //Problem Statement: Given an array of size n, write a program to check if the given array is sorted in (ascending / Increasing / Non-decreasing) order or not.
        // If the array is sorted then return True, Else return False.

        int arr[] = {1,2,4,6};
        System.out.println(CheckIfSorted(arr));



    }


    public static boolean CheckIfSorted(int arr[])
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

}