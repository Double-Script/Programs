import java.util.Scanner;

public class PatternOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        patternone(n);
        System.out.println();
        System.out.println();
        patterntow(n);
        System.out.println();
        System.out.println();
        patternthree(n);
        System.out.println();
        System.out.println();
        patternfour(n);
        System.out.println();
        System.out.println();
        patternfive(n);
        System.out.println();
        System.out.println();
        patternsix(n);
        System.out.println();
        System.out.println();
        patternseven(n);
        System.out.println();
        System.out.println();
        System.out.println();
        patterneight(n);
        System.out.println();
        System.out.println();
        patternnine(5);
    }



    static void patternone(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <2*(n-i); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patterntow(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < 2*i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternthree(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > 0; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    static void patternfour(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternfive(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternsix(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void patternseven(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterneight(int n){
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <n-i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patternnine(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n; j++) {
                if (i==n-2 || i+j==n-1 || j-i==n-3){
                    System.out.print(i+","+j+" ");
                }else {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }

}
