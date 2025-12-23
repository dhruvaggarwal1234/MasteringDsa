// Given array is the descending order we have to apply the Binary Search on it

package Searching;

public class Descending_Order {

    static int Solution(int [] arr , int target){
        int ans = -1, low = 0 , high = arr.length-1;

        while(low<=high){
             int mid = low+ (high-low)/2;
            if(arr[mid] <target){
                high = mid -1 ;
            }

            else if (arr[mid]> target){
                low = mid +1 ;
            }

            else{
                ans = mid ;

                return ans;
            }
        }




        return ans;


    }


    public static void main(String [] args){

        int [] arr = {100,91,87,76,66,52,43,35,29,13,5};

        int target = 29 ;

        System.out.println("This is the index :" + Solution(arr,target));

    }

}
