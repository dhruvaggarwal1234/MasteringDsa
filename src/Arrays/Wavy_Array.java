package Arrays;// [1,2,3,4,5] = > [2,1,4,3,5]

//[3,5,6,7,3,2,1,4]=>  [5,3,7,6,2,3,4,1]

public class Wavy_Array {

    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6};

        for(int i=1; i< arr.length;i=i+2){
            int temp = arr[i];
            arr[i] = arr[i-1];
            arr[i-1]= temp ;
        }

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
