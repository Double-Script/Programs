import java.util.Arrays;
import java.util.Scanner;

public class ReverseEachElement {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("enter array length: ");
        int n = sc.nextInt();
        System.out.println("enter element in array: ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        reveachele(arr,n);



    }

    static void reveachele(int[] arr, int n){
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int rev = 0;
            while(temp!=0){
                int rem= temp%10;
                rev = ((rev*10)+rem);
                temp = temp/10;
            }
            arr[i]= rev;
        }
        System.out.println("after reversing each element this is how array will be: ");
        System.out.println(Arrays.toString(arr));
    }

}
