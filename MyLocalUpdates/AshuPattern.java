
import java.util.*;
public class AshuPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//   Nested Loop
        /*int n = sc.nextInt();
        int m = sc.nextInt();
//        outer loop
        for (int i = 1; i<= n; i=i+1) {
//          inner loop
            for (int j = 1; j <= m; j ++){
                System.out.print("* ");
            }
            System.out.println();
        }

        int o = sc.nextInt();
        int p = sc.nextInt();

//        outer loop

        for(int i = 1; i<= o; i ++) {

        //            inner loop

            for (int j = 1; j <= p; j ++) {

//                cell -> (i,j)
                if (i == 1 || j== 1 || i== o || j==p) {
                    System.out.print("**");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        int w = sc.nextInt();

//        outer loop

        for (int i = 1 ; i<=w; i = i+1) {

        //            inner loop

            for ( int j = 1 ; j<=i; j++) {
                System.out.print("**");
            }
            System.out.println();
        }

//        fifth pattern

        int a = sc.nextInt();

        //        outer loop

        for (int i = a ; i >=1 ; i--){

      //            inner loop

            for(int j = 1; j <= i ; j++){
                System.out.print("*");
            }

            System.out.println();
        }
//      sixth pattern   ***
//        outer loop
        int b = sc.nextInt();

        for (int i = 1; i<= b;i++){
            for (int j = 1; j<=b-i;j++){
                System.out.print("  ");
            }
            for (int j = 1; j<=i;j++){
                System.out.print("**");
            }
            System.out.println();
        }

//        seventh patter

        int c = sc.nextInt();

        for (int i = c ; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

       int d = sc.nextInt();
       int g = 1;

       for (int i = 1; i <= d; i = i+1) {
           for (int j = 1; j <= i; j = j+1) {
               System.out.print(g+"  ");
               g = g +2;
           }
           System.out.println();
       }

        int f = sc.nextInt();

        for (int i = 1; i<= f; i++) {
            for (int j= 1; j<=i;j++) {
                int sum = i+j;
                if(sum % 2 ==0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }

        int e = sc.nextInt();

        for (int i = 1; i<=e; i++) {
            for(int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = e-1; i>=1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/

        int h = sc.nextInt();

        for (int i = 1; i <= h; i++) {
            for (int j = 1; j<=h-i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j<=i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= h-1; i++) {
            for (int j = 1; j<= i; j++) {
                System.out.print("  ");
            }
            for (int j = h-1; j >=i; j--)  {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
