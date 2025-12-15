package Arrays;

public class Array_SecondLargest {

    public static void main(String[] args) {

        int [] arr = {2,4,5,7,1,3,6,9,3-1};

        int FirstLargest = arr[0];
        int SecondLargest = 0;

        for(int i =1 ;i<arr.length;i++){

            if(FirstLargest<arr[i]){
                SecondLargest = FirstLargest;
                FirstLargest = arr[i];
            }
            else if(FirstLargest!=arr[i]&& SecondLargest<arr[i]){
                SecondLargest =arr[i];

            }
        }


        System.out.println("The FirstLargest is :" + FirstLargest);
        System.out.println("The SecondLargest is :" + SecondLargest);
    }


}
