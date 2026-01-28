package Arrays;

/*
------------------------------------------------
Problem: Rotate Array
------------------------------------------------
Rotate an array of size n by k positions (left/right)
using an in-place approach.

Technique:
- Array Reversal Technique (Two Pointer)

Idea:
Right Rotation:
1. k = k % n
2. Reverse entire array
3. Reverse first k elements
4. Reverse remaining n-k elements

Left Rotation:
1. k = k % n
2. Reverse first k elements
3. Reverse remaining n-k elements
4. Reverse entire array

Common Mistakes:
- Forgetting k = k % n
- Mixing left and right rotation logic
- Wrong reverse index ranges
- Using extra array unnecessarily

Time Complexity:
- O(n)

Space Complexity:
- O(1)

Interview Line:
"I rotate the array in place using the array reversal technique."
------------------------------------------------
*/


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
