public class PerfectSqure {
    public static void main(String[] args) {
        for (int i = 1; i <10 ; i++) {
            int pro =0;
            for (int j = 0; j <= i; j++) {
                if (j*j == i) {
//                    System.out.println(j);
                    pro=j*j;
                    break;
                }
            }
            if (pro == i) {
                System.out.println(i+"is perfecct number");
            }else {
                System.out.println(i+"is not perfect number");
            }
        }

    }
}
