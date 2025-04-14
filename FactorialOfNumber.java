public class FactorialOfNumber {
    public static void main(String[] args) {
        int num= 5;
        int sum=1;
        for (int i = num; i > 0; i--) {
            sum = sum * i;
        }
        System.out.println(sum);
    }
}
