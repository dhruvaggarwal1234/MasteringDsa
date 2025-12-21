
// Mountain array  == first the array is the increasing the n start decreasing

package Searching;

public class Mountain_Array {

    static int  sol(int [] arr){

        int low = 0 , high = arr.length -1 ;



        while (low<high){

            int mid = low + (high - low)/2;
            if(arr[mid]<arr[mid+1]){

                low = mid + 1 ;
            }


            else {
                high = mid ;
            }

        }
        return arr[low];
    }

    public static void main(String[] args) {
        int [] arr = {-1,0,2,5,6,8,6,4,3};

        System.out.println("Peak Value is :" + sol(arr));
    }


}
