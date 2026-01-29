package Arrays;

/*
====================================================
TOPIC: Reverse Array (Two Pointer Approach)
====================================================

PROBLEM:
Reverse the given array in-place without using
any extra array.

APPROACH:
Two Pointer Technique

- Use two pointers:
  start → beginning of array
  end   → end of array
- Swap elements at start and end
- Move pointers:
    start++
    end--
- Repeat until start < end

LOGIC:
1. Initialize start = 0
2. Initialize end = arr.length - 1
3. While (start < end):
   - Swap arr[start] and arr[end]
   - Increment start
   - Decrement end

EXAMPLE:
Input:  [1, 2, 3, 4, 5, 6, 7]
Output: [7, 6, 5, 4, 3, 2, 1]

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)  // In-place

WHY OPTIMAL:
✔ No extra space
✔ Single pass
✔ Simple & efficient

INTERVIEW NOTES:
- Uses Two Pointer Technique
- Common base for:
  → Rotate Array
  → Reverse String
  → Reverse subarray
====================================================
*/




public class Reverse_Array {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
