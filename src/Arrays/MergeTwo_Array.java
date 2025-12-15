package Arrays;// Array Must be Sorted manger of the given array
// 3 pointer techiques



public class MergeTwo_Array {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 6};
        int[] arr2 = {2, 4, 6};

        int m = arr1.length;
        int n = arr2.length;

        int[] result = new int[m + n];

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {
            if (arr1[i] > arr2[j]) {
                result[k--] = arr1[i--];
            } else {
                result[k--] = arr2[j--];
            }
        }

        while (i >= 0) {
            result[k--] = arr1[i--];
        }

        while (j >= 0) {
            result[k--] = arr2[j--];
        }

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
