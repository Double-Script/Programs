import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {

        int[] arr = {2,4,56,9};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] num){
        num[0]= 32;
    }
}
