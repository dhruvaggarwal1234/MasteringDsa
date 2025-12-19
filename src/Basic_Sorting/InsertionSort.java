package Basic_Sorting;

public class InsertionSort {

    public static void main(String[] args) {

        int [ ] arr = {1,4,2,7,121,1,1,1,1,2,3,4,5,6,7};

        for(int i = 1; i<arr.length;i++){
            int j = i ;
            while(j>0&&arr[j]<arr[j-1]) {

                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1]= temp;
                j--;
            }
        }

        for(int a: arr){
            System.out.print(a+ " ");
        }
    }
}
