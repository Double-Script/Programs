// sum of eaach digit factorial is eqals to given number is called as strong number
public class StrongWeekNum {
    public static void main(String[] args) {
        int num= 145;
        int temp = num;

        int sum =0;
        while(num!=0){
            int rem = num%10;
            int fact=1;
            for (int i = rem; i > 0; i--) {
                fact = fact * i;

            }
            sum = sum+fact;
            num= num/10;

        }
        if(sum==temp){
            System.out.println("it is strong number");
        }else {
            System.out.println("it is not");
        }
        System.out.println(sum);
    }
}
