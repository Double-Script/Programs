public class SunnyNumber {
    public static void main(String[] args) {
        int num = 15;
        int num1= num+1;
//        int total=0;
        for (int i = 1; i < num1/2; i++) {
            if (i*i == num1) {
//                total=i*i;
                System.out.println("it is suuny num");
            }
        }
//        if(total==num1){
//            System.out.println("it is suuny num");
//        }else{
//            System.out.println("it is not");
//        }
    }
}
