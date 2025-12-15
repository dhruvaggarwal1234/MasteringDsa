package Arrays;//not use the Arraylist

//[1,0,0,0]+1 => [1,0,0,1]
//[9,9,9,9]+1 => [1,0,0,0,0]

public class Adding_One_in_Array {

    public static void main(String[] args) {

        int[] arr = {9, 9, 9, 9};

        int[] result = addone(arr);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    static int[] addone(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {

            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            }

            arr[i] = 0;
        }

        int[] result = new int[arr.length + 1];
        result[0] = 1;
        return result;
    }
}
