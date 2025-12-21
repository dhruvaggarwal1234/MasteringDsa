package Searching;




public class First_Occurance_Sorted {

    static int index_target(int [] arr , int target){
        int index = -1 ;

        int low = 0 ;
        int high = arr.length-1;

        while (low<=high){

           int mid = low +(high-low)/2;

           if (arr[mid] > target){
               high = mid -1 ;

           }

           else if( arr[mid] < target){
               low =mid + 1;
           }

           else {
               if(index==-1||mid>index){

                   index = mid;
                   low = mid +1;
               }
           }

        }



        return index ;
    }

    public static void main (String [] args ){

        int [] arr = {1,1,2,2,2,3,4,5,5,6,7,8,11};
        int target = 5;

        System.out.println("This is the Index Of arr : " + index_target(arr, target));
    }

}
