package Arrays;

public class Missing_Array_Distinct {
    public static void main(String[] args) {
        int [ ] arr = {1,2,3,4,7,8,5};
        int n = arr.length + 1;   // because one number is missing

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        System.out.println("Missing element : " + (expectedSum -actualSum) );

    }
}
