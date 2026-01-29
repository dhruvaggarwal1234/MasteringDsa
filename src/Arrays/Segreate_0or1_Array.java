package Arrays;

/*
====================================================
TOPIC: Segregate 0s and 1s in an Array
====================================================

PROBLEM:
Given an array containing only 0s and 1s,
rearrange the array so that all 0s come first
and all 1s come after.

Example:
Input:  [0,1,1,0,1,0,0,1]
Output: [0,0,0,0,1,1,1,1]

APPROACH:
Two Pointer Technique

- Start pointer → beginning of array
- End pointer   → end of array
- Move pointers based on values:
  1) If start = 1 and end = 0 → swap
  2) If start = 0 and end = 1 → both correct, move both
  3) If start = 1 and end = 1 → move end
  4) If start = 0 and end = 0 → move start

LOGIC:
1. Initialize Start = 0
2. Initialize End = arr.length - 1
3. While (Start < End):
   - Compare arr[Start] and arr[End]
   - Swap or move pointers accordingly

WHY THIS WORKS:
- 0s pushed to left
- 1s pushed to right
- No extra space used

TIME COMPLEXITY:
O(n)

SPACE COMPLEXITY:
O(1)

WHY OPTIMAL:
✔ Single traversal
✔ In-place solution
✔ Uses Two Pointer Technique

INTERVIEW NOTES:
- Variation of partition problems
- Base logic for:
  → Segregate 0,1,2
  → Dutch National Flag
  → Array partitioning
====================================================
*/


public class Segreate_0or1_Array {

    public static void main(String[] args) {

        int [] Array = {0,0,1,0,1,0,1,0,1,0};

        int Start = 0;
        int End = Array.length -1 ;


        while(Start<End){

            if(Array[Start]==1&&Array[End]==0){

                int temp = Array[Start];
                Array[Start] = Array[End];
                Array[End] = temp ;
                Start++;
                End--;
            }
            else if (Array[Start]==0&&Array[End]==1){
                Start++;
                End--;
            }
            else if (Array[Start]==1&&Array[End]==1){
                End--;
            }
            else if (Array[Start]==0&&Array[End]==0){
                Start++;
            }
        }

        for(int arr :Array){
            System.out.print(arr + " ");
        }
    }
}
