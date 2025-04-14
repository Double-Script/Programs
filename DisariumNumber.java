
public class DisariumNumber {
        public static void main(String[] args) {
            int num =135;
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
                count--;
                total = total + tm;
                temp=temp/10;
            }
            if (total == fil) {
                System.out.println("it is diasrium number");
            }else {
                System.out.println("it is not");
            }
        }

}
