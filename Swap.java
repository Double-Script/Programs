import java.util.Arrays;

import static java.util.Collections.swap;

public class Swap {

    public static void main(String[] args) {

        int[] arr = new int[5];
        arr[0]= 23;
        arr[1]= 2;
        arr[2]= 18;
        arr[3]= 12;
        arr[4]= 40;



        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        reverse(arr);
//        swap(arr, 2, 4);
        System.out.println(Arrays.toString(arr));


    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(end>start){
            swap(arr, start,end);
            start++;
            end--;
        }
    }
    static void swap(int[] arr,int index1,int index2) {
        int temp = arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

    }


}
