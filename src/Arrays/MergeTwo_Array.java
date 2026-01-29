package Arrays;

/*
====================================================
TOPIC: Merge Two Sorted Arrays (3 Pointer Technique)
====================================================

PROBLEM:
Given two sorted arrays, merge them into a single
sorted array.

Example:
arr1 = [1, 3, 5, 6]
arr2 = [2, 4, 6]

Output:
[1, 2, 3, 4, 5, 6, 6]

IMPORTANT NOTE:
- Both input arrays must be sorted
- Result array size = arr1.length + arr2.length

APPROACH:
Three Pointer Technique (Backward Merge)

Pointers Used:
i → last index of arr1
j → last index of arr2
k → last index of result array

WHY BACKWARD MERGE?
- Avoids extra shifting
- Efficient placement of largest elements first

LOGIC:
1. Initialize:
   i = arr1.length - 1
   j = arr2.length - 1
   k = result.length - 1

2. While (i >= 0 && j >= 0):
   - Compare arr1[i] and arr2[j]
   - Place the larger element at result[k]
   - Decrement corresponding pointer

3. Copy remaining elements (if any):
   - If arr1 has elements left → copy them
   - If arr2 has elements left → copy them

TIME COMPLEXITY:
O(m + n)

SPACE COMPLEXITY:
O(m + n)

WHY OPTIMAL:
✔ Single traversal
✔ Sorted order maintained
✔ Clean and efficient

INTERVIEW NOTES:
- Uses 3 pointer technique
- Very common in merge sort
- Can be modified for in-place merge
====================================================
*/



public class MergeTwo_Array {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 6};

        int m = arr1.length;
        int n = arr2.length;

        int[] result = new int[m + n];

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                result[k--] = arr1[i--];
            } else {
                result[k--] = arr2[j--];
            }
        }

        while (i >= 0) {
            result[k--] = arr1[i--];
        }

        while (j >= 0) {
            result[k--] = arr2[j--];
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
