public class Pattern {
    public static void main(String[] args) {
int m= 5;
int n = 5;

        for(int i=1; i<=m; i++ ){
            for (int j=1; j<=n; j++){
                if (i==1 || i==5 || j==1 || j==5 ){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


//        for(int i=1; i<=m; i++){
//
//for (int j=1; j<=i; j++){
//                System.out.print(i);
//            }
//            System.out.println();
//        }
    }
}
