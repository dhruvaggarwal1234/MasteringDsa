package Arrays;

/*
------------------------------------------------
Problem: Missing Number (Distinct Elements)
------------------------------------------------
Given an array of size n containing distinct numbers
from the range 0 to n, find the missing number.

Technique:
- Mathematical Sum Formula

Idea:
1. Expected sum of numbers from 0 to n:
   sum = n * (n + 1) / 2
2. Calculate the sum of elements present in the array
3. Missing number = expected sum - array sum

Why it works:
- All elements are distinct
- Exactly one number from 0 to n is missing

Common Mistakes:
- Forgetting numbers start from 0
- Integer overflow for large n (use long if needed)
- Off-by-one errors using array length

Time Complexity:
- O(n)

Space Complexity:
- O(1)

Interview Line:
"I subtract the array sum from the expected sum to find the missing number."
------------------------------------------------
*/



public class Missing_Array_Distinct {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,7,8,5};
        int n = arr.length + 1;   // because one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing element : " + (expectedSum -actualSum) );

    }
}
