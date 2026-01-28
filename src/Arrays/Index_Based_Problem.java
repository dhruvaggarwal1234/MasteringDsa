package Arrays;


/*
====================================================
DSA NOTE: INDEX-BASED ARRAY TRANSFORMATION
====================================================

Problem Statement:
Multiply odd indexed elements by 2 and add 10 to even indexed elements.

----------------------------------------------------
Technique Used:
1. Linear Traversal
2. Index-Based Conditional Logic
3. Modulo Operator (%)
4. In-place Array Modification

----------------------------------------------------
Approach:
- Traverse the array using a single loop.
- Use index parity (i % 2) to decide operation:
    • Even index  -> add 10
    • Odd index   -> multiply by 2
- Modify the array directly (no extra space).

----------------------------------------------------
Key Insight:
- Condition is based on INDEX, not VALUE.
- Use: i % 2 (NOT arr[i] % 2)

----------------------------------------------------
Time Complexity:
- O(n) → Single traversal of the array

Space Complexity:
- O(1) → No extra space used

----------------------------------------------------
Why This Is Optimal:
- Avoids nested loops
- Avoids extra arrays
- Best possible time complexity for this problem

----------------------------------------------------
Common Mistakes:
❌ Using arr[i] % 2 instead of i % 2
❌ Using extra array unnecessarily
❌ Using multiple loops

----------------------------------------------------
Pattern Name (Important for Interviews):
"Index-Based Conditional Array Manipulation"

----------------------------------------------------
Similar Problems:
- Modify elements at alternate indices
- Add/subtract values at even/odd positions
- Index-based swapping problems
====================================================
*/



public class Index_Based_Problem {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,0,8,9};

        for(int i = 0 ; i<arr.length ; i++){
            if( i%2==0){
                arr[i] +=10;

            }
            else{
                arr[i] *=2;
            }
        }

        for(int ar:arr){
            System.out.print(ar+" ");
        }
    }
}
