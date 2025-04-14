// write a java program to find the prime number from given range.
public class PrimeInRange {
    public static void main(String[] args) {
        int Snum = 2;
        int Enum = 25;
        int num = 0;
        for (int i = Snum; i <=Enum; i++) {
            int count=0;
            for (int j = 2; j <=i; j++) {
                if(i%j ==0) {
//                    System.out.println(i);
                    count ++;
                }
            }
            if (count == 1) {
                System.out.println(i);
            }
        }

    }
}
