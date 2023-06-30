
import java.util.*;
public class AshuConditional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("you are adult");
        }
        else {
            System.out.println("You are minor");
        }

        int x = sc.nextInt();

        if (x % 2 == 0)  {
            System.out.println("This is a Even number");
        } else {
            System.out.println("This is a odd number");
        }

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a==b) {
            System.out.println("equals");
        }
        else if (a>b) {
            System.out.println("a is greater");
        }
        else {
            System.out.println("a is smaller");
        }



        System.out.println("What is your country name : ");


        String button = sc.next();

      /*  if (button.equals("england")) {
            System.out.println("Hello");
        } else if (button.equals("india")) {
            System.out.println("Namaste");
        } else if (button.equals("fance")){
            System.out.println("Bonjour");
        } else{
            System.out.println("Invalid");
        }*/

        switch (button) {
            case "england" -> System.out.println("Hello");
            case "india"   -> System.out.println("Namste");
            case "france"  -> System.out.println("Bonjour");
            default        -> System.out.println("Invalid");
        }


    }
}
