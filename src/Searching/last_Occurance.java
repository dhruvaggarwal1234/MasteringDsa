package Searching;

public class last_Occurance {

    static int last_index(int [] arr , int target){
        int index = -1 ,low = 0 , high = arr.length-1 ;

        while (low<=high){
            int mid = low +(high-low)/2;
            if(arr[mid]>target){
                high= mid -1 ;
            }

            else if (arr[mid]< target){
                low = mid +1;
            }

            else {
                if(index==-1||mid >index){
                    index = mid ;
                    low = mid+1;
                }
            }
        }


        return index;
    }

    public static void main (String [] args ){

        int [] arr = {1,1,2,2,2,3,4,5,5,5,5,6,7,8,11};
        int target = 5;

        System.out.println("This is the Index Of arr : " + last_index(arr, target));
    }
}
