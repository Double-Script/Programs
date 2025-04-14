import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];

        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 !=0){
                System.out.println("odd number" + arr[i]);
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2 ==0) {
                System.out.println("even number" + arr[i]);
            }
        }

    }
}
