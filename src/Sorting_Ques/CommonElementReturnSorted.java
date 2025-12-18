    // in this we have find and sort the arrays by common element in the two arrasy



    package Sorting_Ques;

    import java.util.ArrayList;
    import java.util.Arrays;

    public class CommonElementReturnSorted {



        //Arraylist Solution for it
        static ArrayList<Integer> byArraylist(int[] arr1 , int [] arr2){

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            int i =0 ;
            int j = 0 ;
            ArrayList <Integer> arr = new ArrayList<Integer>();



            while(i<arr1.length&&j<arr2.length){
                if (arr1[i]==arr2[j]){

                    arr.add(arr1[i]);
                    i++;
                    j++;
                }
                else if (arr1[i]< arr2[j]){
                    i++;
                }
                else {
                    j++;
                }
            }

            return arr;
        }


        public static void main(String[] args) {

            int [] arr2  = {2,1,2,4,3,3,4,56,3,4,5};  // 1,2,2,3,3,3,4,4,4,5,56
            int [] arr1  = {1,1,2,2,3,4,56,3,4,7};   // 1,1,2,2,3,3,4,4,7,56

            ArrayList<Integer> arr = byArraylist(arr2,arr1);

            for(int a:arr){
                System.out.print(a + " ");
            }

        }
    }
