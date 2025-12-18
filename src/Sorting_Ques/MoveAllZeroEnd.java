//[1,0,2,3,0,4,-2,0,3] => [1,2,3,4,-2,3,0,0,0]


package Sorting_Ques;





public class MoveAllZeroEnd {


    //Optimal Approach
    static int[] moveZeroPointer(int[] arr){
        int j = 0 ;

        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]!=0){
             int temp = arr[j];
             arr[j] = arr[i];
             arr[i]= temp;
             j++;
            }
        }

        return arr;

    }


    //UnderStanding BubbleSort Meaning
    static int [] moveZeroBubble(int[] arr){

        int n  = arr.length-1;
        for(int i =0 ; i<n;i++){
            boolean swapped =false;
            for(int j =0 ; j<n-i; j++){
                if(arr[j]==0){

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =true;

                }

            }
            if(!swapped) break;

        }


        return arr;
    }


    public static void main(String[] args) {

        int [] arr = {1,0,2,3,0,4,-2,0,3};
        moveZeroPointer(arr);
        for(int a :arr){
            System.out.print(a+ " ");
        }


    }

}
