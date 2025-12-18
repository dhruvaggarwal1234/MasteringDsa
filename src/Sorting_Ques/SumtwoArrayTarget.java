package Sorting_Ques;

import java.util.Arrays;

public class SumtwoArrayTarget {

    //Optimal Approach

    static int [] optimalTwoSum(int [] arr, int target){
        int [] arr1  ={-1,-1};

        //Using the Build in the Sort that is the  MergeSort it use
        //it Time Complexity == 0(nlognn)

        Arrays.sort(arr);

        int x = 0 ;
        int y = arr.length-1;

        while(x<y){
            if (arr[x]+arr[y]<target){
                x++;
            }
            else if (arr[x]+ arr[y] >target){
                x++;
                y--;
            }

            else {
                arr1[0] =x;
                arr1[1] =y;
                return arr1;
            }

        }

        return arr1;
    }


    //Basic Approach
    static int[]  basictwoSum(int [] arr, int target){

        int []arr1 = {-1,-1} ;


        for(int i = 0 ; i < arr.length;i++){
            for(int j=i ; j<arr.length ;j++){
                if(arr[i]+arr[j]==target ){
                    arr1[0]=i;
                    arr1[1]=j;
                    return arr1;
                }
            }
        }

         return arr1 ;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,2,3,5,4,6,7,0};
        int target =  7;

        int [] ARR1=  optimalTwoSum(arr , target);


        for(int a : ARR1){

            if(a==-1){
                System.out.println("Target Not Found ");
                break;
            } System.out.print( a + " ");

        }
    }
}
