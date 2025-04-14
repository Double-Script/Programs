public class NeionNum {
    public static void main(String[] args) {
        int num=9;
        int Snum = num*num;
        int total = 0;
        while(Snum!=0){
            int rem = Snum%10;
            total= total + rem;
            Snum= Snum/10;
        }
        if (total == num) {
            System.out.println("it is neon number");
        }else {
            System.out.println("its not");
        }
    }
}
