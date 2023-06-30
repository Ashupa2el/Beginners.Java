import java.util.*;

public class AshuSimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a :");
        int a = sc.nextInt();
        System.out.println("Enter second number b :");
        int b = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int multiplication = a*b;
        int division = a/b;

        System.out.println("Choose what u want to do : 1:add; 2:subtract; 3:multiplication; 4:division");


        int button = sc.nextInt();

        switch (button) {
            case 1 -> System.out.println("Addition of a and b is : "+ sum);
            case 2 -> System.out.println("Subtration of a and b is : "+ diff);
            case 3 -> System.out.println("Multiplication of a and b is : "+ multiplication);
            case 4 -> System.out.println("Division of a and b is : "+ division);
            default -> System.out.println("Invalid Entry");
       }

        System.out.println("Enter the number of the month :");

        int month = sc.nextInt();

        switch (month) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11-> System.out.println("November");
            case 12-> System.out.println("December");
            default -> System.out.println("Invalid Entry");

        }


    }
}
