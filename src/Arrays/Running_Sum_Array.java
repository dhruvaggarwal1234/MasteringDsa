package Arrays;


/*
-----------------------------------------------
Problem: Running Sum of 1D Array
-----------------------------------------------

Problem Statement:
Given an integer array nums, return the running sum of the array.
The running sum at index i is defined as the sum of elements from
index 0 to index i.

Example:
Input:  [1, 2, 3, 4, 5]
Output: [1, 3, 6, 10, 15]

Explanation:
- At index 0: 1
- At index 1: 1 + 2 = 3
- At index 2: 1 + 2 + 3 = 6
- At index 3: 1 + 2 + 3 + 4 = 10
- At index 4: 1 + 2 + 3 + 4 + 5 = 15

Technique Used:
Prefix Sum (Running Sum)

Key Idea:
Each element stores the sum of itself and all previous elements.
We maintain a running variable that keeps track of the cumulative sum.

Approach:
1. Initialize a variable sum = 0
2. Traverse the array from left to right
3. Add current element to sum
4. Store sum at the current index
5. Return the modified array

Time Complexity:
O(n) — single traversal of the array

Space Complexity:
O(1) — in-place modification, no extra array used

Why This Is Optimal:
- Avoids nested loops
- Avoids recalculating sums
- Uses prefix sum efficiently

One-Line Summary:
Running sum means carrying the previous sum forward.
-----------------------------------------------
*/






public class Running_Sum_Array {

    public int[] runningSum(int[] nums) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};

        Running_Sum_Array obj = new Running_Sum_Array();
        int [] results = obj.runningSum(arr);

        for(int a : results){
            System.out.print(a + " ");
        }
    }
}
