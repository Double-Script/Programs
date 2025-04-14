// the sum of factors except the given number will be eqals to given numbers then it is perfect number
public class PerfectNumber {
    public static void main(String[] args) {
        int num=6;
        int sum=0;
        for (int i = 1; i <num ; i++) {
            if(num%i==0){
             sum = sum + i;
            }
        }
        System.out.println(sum);
        if (num==sum){
            System.out.println("it is perfect number");
        }else {
            System.out.println("not perfect");
        }
    }
}
