package Arrays;// if [9,9,9,9]+ 1 ==> [1,0,0,0,0]

// [5,6,7,8] => [5,6,7,9]

import java.util.ArrayList;

public class Adding_one_in_ArrayList {

    public static void main(String[] args) {
        ArrayList <Integer> arr = new ArrayList<>();
        arr.add(9);
        arr.add(9);
        arr.add(7);
        arr.add(8);

//        for(int a : arr){
//            System.out.print(a+" ");
//        }

        int n = arr.size()-1;
        for(int i=n ; i>-1;i-- ){

            if(arr.get(i)+1 <10){
                int k = arr.get(i)+1;
                arr.set(i,k);
                break;

            }
            else if(arr.get(i)+1==10 && i==0){
                arr.set(i,0);
                arr.add(0,1);
            }

            else{
                arr.set(i,0);
            }
        }


        for(int a : arr){
            System.out.print(a + " ");
        }

    }
}