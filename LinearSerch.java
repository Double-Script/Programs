import java.util.*;

public class LinearSerch {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int k = sc.nextInt();
        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]= sc.nextInt();
        }
        System.out.println("enter element to check");
        int n = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==n){
                System.out.println("it is present at index "+i);
            }
        }

    }
}
