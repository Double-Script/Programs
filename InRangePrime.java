public class InRangePrime {
    public static void main(String[] args) {
//        Scanner sc = new Scanner (System.in);
//        int num = sc.nextInt();
        for (int i = 3; i < 10; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
//                    System.out.println("i"+i+"j"+j+"c"+count);
                }
            }
            if (count==2){
                System.out.println(i + " ");
            }
        }
    }
}
