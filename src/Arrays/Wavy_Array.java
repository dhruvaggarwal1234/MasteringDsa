package Arrays;


/*
====================================================
TOPIC: Wavy Array (Pair-wise Swap)
====================================================

PROBLEM:
Convert a normal array into a wavy (zig-zag) form
by swapping adjacent elements.

Wavy Form Rule:
arr[0] >= arr[1] <= arr[2] >= arr[3] <= ...

Examples:
Input:  [1,2,3,4,5]
Output: [2,1,4,3,5]

Input:  [3,5,6,7,3,2,1,4]
Output: [5,3,7,6,2,3,4,1]

APPROACH:
Pair-wise Swapping

- Start from index 1
- Swap current element with previous element
- Move index by +2 to handle next pair

LOGIC:
1. Loop from i = 1 to end of array
2. Increment i by 2
3. Swap arr[i] with arr[i - 1]

CODE IDEA:
for (int i = 1; i < arr.length; i += 2) {
    swap(arr[i], arr[i - 1]);
}

EDGE CASES:
- If array length is odd → last element remains unchanged
- Works for already sorted or unsorted arrays

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)

WHY OPTIMAL:
✔ Single pass
✔ No extra space
✔ Simple and efficient

INTERVIEW NOTES:
- Also called Zig-Zag Array
- Different from sorted wavy array
- No sorting required here
====================================================
*/


public class Wavy_Array {

    public static void main(String[] args) {
        int arr [] = {3,5,6,7,3,2,1,4};

        for(int i=1; i< arr.length;i=i+2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]= temp ;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
