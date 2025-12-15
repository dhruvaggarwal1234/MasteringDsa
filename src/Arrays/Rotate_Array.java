package Arrays;

import java.util.Scanner;

public class Rotate_Array {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4};
        int i = 0;
        int t = arr.length;

        System.out.println("Enter the value for the target want to rotate :");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        k = k % t;

        // this reverse whole array
        reverse(arr, i, t - 1);

        // this reverse first k elements
        reverse(arr, i, k - 1);

        // this  reverse remaining elements
        reverse(arr, k, t - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }

        //this is the help to close the sc close
        sc.close();


    }

    static void reverse(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
}
