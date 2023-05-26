//Ameer Ahmed

import java.util.Scanner;

public class Small_Big_Nums {
    public static int[] minMax(int[] arr) {

    int min = arr[0];
    int max = arr[0];

    //edge case of empty array
    if(arr.length == 0) {
       System.out.println("The array is empty!");
    }

    for(int i = 1; i < arr.length; i++) {
        if(arr[i] < min) {
            min = arr[i];
        }
        else if(arr[i] > max) {
            max = arr[i];
        }
    }
        int[] result = {min, max};
        return result;
    }
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // n stores the indexes that user defines
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] output = minMax(nums);

        System.out.println("Minimum: " + output[0]);
        System.out.println("Maximum: " + output[1]);

    }
}