package Sorting_Ques;

public class kth_Smallest {

    // in the  future there is the hashing is the coming


    // this the selection Sort solution
    static int  kth_Selection(int[] arr , int k){


        for(int i = 0 ; i < arr.length ; i++){
            int a = Integer.MAX_VALUE;
            int b = -1;
            for(int j =i; j< arr.length;j++){

                if(arr[j]<a){
                    a=arr[j];
                    b = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[b];
            arr[b] =temp;
        }

        return arr[k-1];
    }

    public static void main(String[] args) {
        int [ ] arr = {1,4,2,7,121,1,1,1,1,2,3,4,5,6,7};

        int k = 4;

        System.out.println("kth smallest :" + kth_Selection(arr,k));
    }
}
