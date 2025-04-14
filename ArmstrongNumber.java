// the sum of power of each digit based on the count will be eqals to the given number then it is armstrong number.

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num =153;
        int temp =num;
        int fil=num;
        int total=0;
        int count =0;
        while(num>0){
            count ++;
            num=num/10;
        }
        while(temp>0){
            int rem=temp%10;
            int tm=1;
            for (int i = 1; i <=count; i++) {
                tm = tm*rem;
            }
            total = total + tm;
            temp=temp/10;
        }
        if (total == fil) {
            System.out.println("it is armstrong number");
        }else {
            System.out.println("it is not");
        }
    }
}
