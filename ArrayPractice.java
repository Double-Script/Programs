// Q1 write a java program to print even index elements
// Q2 write a java program to count number of element in array
// Q3 write a java program to sum of number of elements in array
// !4 write a java program to print average of elemtns
//Q 5 write a java program to identify the average of odd elements
import java.util.Scanner;

public class ArrayPractice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        oddnum(arr , n);
        System.out.println();
        evenindex(arr,n);
        System.out.println();
        count(arr,n);
        System.out.println();
        avg(arr,n);
        System.out.println();
        sumeven(arr,n);
        System.out.println();
        avgodd(arr,n);
    }
    static void oddnum(int[] arr, int n){
        System.out.print("Odd elements are:");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.print(arr[i]+ " ");
            }
        }
    }

    static void evenindex(int[] arr, int n){
        System.out.print("even index elements are:");
        for (int i = 0; i < arr.length; i++) {
            if (i%2==0){
                System.out.print(arr[i]+ " ");
            }
        }
    }

    static void count(int[] arr, int n){
        System.out.print("count of array is:");
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        System.out.print(sum);
    }

    static void avg(int[] arr, int n){
        int count=0;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            count++;
            sum += arr[i];
        }
        int avg = sum/count;
        System.out.print("average of element is: "+ avg);
    }

    static void sumeven(int[] arr, int n){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0) {
                sum += arr[i];
            }
        }
        System.out.print("sum of even element is: "+sum);
    }

    static void avgodd(int[] arr , int n){
        int count=0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                count++;
                sum+=arr[i];
            }
        }
        int avg = sum/count;
        System.out.print("average of add element is: " + avg);
    }
}
