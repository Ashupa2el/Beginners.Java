import java.util.*;
public class AshuJavaPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int c = sc.nextInt();
        int d = sc.nextInt();

        for (int i = 1; i <= c; i++) {
            for (int j = 1; j <= d; j++) {
                if (i==1 || j==1 || i==c || j==d) {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }*/

       /* int e = sc.nextInt();

        for (int i = 1; i <= e; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

       /* int f = sc.nextInt();

        for (int i = f; i >= 1; i--) {
            for (int j = 1; j <= i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        /*int f = sc.nextInt();

        for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = f-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        int g = sc.nextInt();

        for (int i = g-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= g-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
