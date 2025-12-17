package Basic_Sorting;

public class SelectionSort {


    static int [] selectionSort(int [] arr){

        int n = arr.length;
        for(int i = 0 ; i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int min_index = i;

            for(int j=i ;j<n;j++){
            if(arr[j]<min){
                min = arr[j];
                min_index = j;
            }}

            int temp = arr[i];
            arr[i] =arr[min_index];
            arr[min_index] =temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        int [] arr = {1,0,2,3,0,4,-2,0,3,4};

        selectionSort(arr);
        for(int a :arr){
            System.out.print(a+ " ");
        }
    }

}

