package Arrays;// if arr is [0,1,1,0,1,0,0,1]   ===>  [0,0,0,0,1,1,1,1]

public class Segreate_0or1_Array {

    public static void main(String[] args) {

        int [] Array = {0,0,1,0,1,0,1,0,1,0};

        int Start = 0;
        int End = Array.length -1 ;


        while(Start<End){

            if(Array[Start]==1&&Array[End]==0){

                int temp = Array[Start];
                Array[Start] = Array[End];
                Array[End] = temp ;
                Start++;
                End--;
            }
            else if (Array[Start]==0&&Array[End]==1){
                Start++;
                End--;
            }
            else if (Array[Start]==1&&Array[End]==1){
                End--;
            }
            else if (Array[Start]==0&&Array[End]==0){
                Start++;
            }
        }

        for(int arr :Array){
            System.out.print(arr + " ");
        }
    }
}
