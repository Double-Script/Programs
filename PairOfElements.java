import java.util.Scanner;

public class PairOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter size");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enterr a value check pairs");
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (k==i+j && i!=j){
                    System.out.println("elements are : "+ i + " and "+ j);
                }
            }
        }
    }
}
