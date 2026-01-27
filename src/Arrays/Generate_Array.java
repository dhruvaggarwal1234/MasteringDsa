package Arrays;
import java.util.Scanner;



/*
------------------------------------------------
Problem: Get Maximum in Generated Array
------------------------------------------------

Problem Statement:
Given an integer n, generate an array nums of size n + 1 using
the following rules and return the maximum value in the array.

Rules:
- nums[0] = 0
- nums[1] = 1
- For i from 2 to n:
    - If i is even: nums[i] = nums[i / 2]
    - If i is odd : nums[i] = nums[i / 2] + nums[i / 2 + 1]

Example:
Input:  n = 7
Generated array: [0, 1, 1, 2, 1, 3, 2, 3]
Output: 3

Technique Used:
Dynamic Programming (1D) + Linear Scan

Key Idea:
Each value in the array depends on previously computed values.
While generating the array, track the maximum element.

Approach:
1. Create an array of size n + 1
2. Initialize base cases nums[0] = 0 and nums[1] = 1
3. Traverse from index 2 to n
4. Generate each value using the given rules
5. Update the maximum value during generation
6. Return the maximum

Time Complexity:
O(n)

Space Complexity:
O(n)

One-Line Summary:
Generate the array using given rules and track the maximum value.
------------------------------------------------
*/









public class Generate_Array {

    public  int Generate_Array(int n){

        if(n==0) return 0;

        int Max = 1;
        int [] Arr = new int[n+1];
        Arr[0] = 0;
        Arr[1]=1;

        for(int i =2; i<Arr.length; i++){
            int a = i/2;

            if(i%2==0){
                Arr[i]= Arr[a];
            }
            else{
                Arr[i] = Arr[a]+ Arr[a+1];
            }
            Max = Math.max(Arr[i] ,Max);
        }

        return Max ;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        Generate_Array obj = new Generate_Array();
        int Results = obj.Generate_Array(n);

        System.out.println("This is the Maximum arrays is the gentrated :" + Results);
    }
}
