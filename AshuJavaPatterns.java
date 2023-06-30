import java.util.*;
public class AshuJavaPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
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
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
