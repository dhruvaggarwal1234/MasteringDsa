//array is given the sorted
//hint : in this we use the nested if statements


package Sorting_Ques;
import java.util.Arrays;

public class union_of_sorted {




        static int[] union(int[] a, int[] b) {

            int i = 0, j = 0, k = 0;
            int n = a.length, m = b.length;

            int[] temp = new int[n + m];

            while (i < n && j < m) {

                if (a[i] < b[j]) {
                    if (k == 0 || temp[k - 1] != a[i]) {
                        temp[k++] = a[i];
                    }
                    i++;
                }
                else if (a[i] > b[j]) {
                    if (k == 0 || temp[k - 1] != b[j]) {
                        temp[k++] = b[j];
                    }
                    j++;
                }
                else { // equal
                    if (k == 0 || temp[k - 1] != a[i]) {
                        temp[k++] = a[i];
                    }
                    i++;
                    j++;
                }
            }

            while (i < n) {
                if (k == 0 || temp[k - 1] != a[i]) {
                    temp[k++] = a[i];
                }
                i++;
            }

            while (j < m) {
                if (k == 0 || temp[k - 1] != b[j]) {
                    temp[k++] = b[j];
                }
                j++;
            }

            return Arrays.copyOf(temp, k);
        }

        public static void main(String[] args) {

            int[] a = {1, 2, 2,3, 3, 4};
            int[] b = {2,2,2, 3, 5, 6};

            System.out.println(Arrays.toString(union(a, b)));
        }
    }


