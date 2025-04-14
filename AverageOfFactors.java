public class AverageOfFactors {
    public static void main(String[] args) {
        int num= 10;
        int sum = 0;
        int count = 0;

        for (int i = 1; i <=num; i++) {
            if (num%i == 0) {
                sum = sum + i;
                count++;
            }
        }
        int avg = sum/count;
        System.out.println(avg);
    }
}
