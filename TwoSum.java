import java.sql.Array;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of array");
        int n = sc.nextInt();
        System.out.println("enter number to find sum");
        int num = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter array element");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                int sum = arr[i]+ arr[j];
                if(num == sum){
                    System.out.print(i);
                    System.out.println(j);
                }
            }
        }
    }

}
