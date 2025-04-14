import java.sql.Array;
import java.util.*;

import static java.lang.Integer.MIN_VALUE;

public class HigestSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("give array size :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter element: ");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if(sum<i+j){
                    sum = i+j;
                }
            }
        }
        System.out.println(sum);
    }
}
