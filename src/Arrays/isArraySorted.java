package Arrays;

public class isArraySorted {

    static boolean SortedArray(int [] arr){

        boolean sorted = true ;

        for(int i = 1 ; i<arr.length;i++){
            if(arr[i-1]>arr[i]){
                sorted = false;
            }
            }return sorted;
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,0};

        System.out.println(SortedArray(arr));
    }
}
