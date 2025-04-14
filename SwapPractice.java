import java.util.Scanner;

import static java.util.Collections.swap;

public class SwapPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }

        reverse(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
    static void reverse(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(end>start){
            swap(arr, start, end);
            start++;
            end--;
        }
    }
static void swap(int arr[],int index1,int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
}

}
