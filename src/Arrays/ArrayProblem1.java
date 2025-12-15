package Arrays;

// Problem  print the negative number only and input the value for the user
 import java.util.Scanner;


public class ArrayProblem1 {

    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the array :");
        int n = sc.nextInt();
        int [] arr = new int [n];

        System.out.println("Enter the value of the array");
        for (int i = 0 ; i <arr.length ; i ++){

            arr[i] = sc.nextInt();
        }

        for(int i =0 ; i< arr.length;i++){
            if(arr[i]<0) System.out.println(arr[i]);

        }


    }
}
