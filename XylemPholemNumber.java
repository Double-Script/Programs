// the sum of first digit and last digit is the sum of middle digits then it is xylem else it is pholem

public class XylemPholemNumber {
    public static void main(String[] args) {
        int num = 1234;
        int rem = num%10;
        num = num/10;
        int total1=0;
        while(num>9){
            int rem2 =num%10;
            total1= total1+rem2;
            num = num/10;
        }

        int total2=num+rem;
        if(total1==total2){
            System.out.println("it is Xylem number");
        }
        else {
            System.out.println("its pholem");
        }
    }
}
