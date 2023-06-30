import java.util.*;

public class AshuLoops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int counter = n ; counter < n*11;  counter = counter + n){
            System.out.print(counter+"     ");
        }
        System.out.println("\n");



        int a = sc.nextInt();
        int i = a;
        while (i<a*11) {
            System.out.println(i);
            i = i+a;
        }


        System.out.println("----------\n");
        int j = 12;
        do {
            System.out.println(j);
            j++;
        } while (j < 23);

    }
}
