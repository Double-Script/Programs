import java.util.Scanner;

public class IpOp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr=new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int maxval=arr[0];
        int minval=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxval){
                maxval=arr[i];
            } else if (arr[i]< minval) {
                minval=arr[i];
            }
            System.out.print(arr[i]+" ");
        }

        int newval = minval+maxval /2;
        System.out.println("max value is:"+ maxval);
        System.out.println("min value is:"+ minval);
        System.out.println("new value is:"+ newval);
    }
}
