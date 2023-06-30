package MyLocalUpdates;

import java.util.*;
public class AshuImporting {
    public static void main(String[] args) {
//      Taking  Input 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your age:");
        int age = sc.nextInt();
        System.out.println("Enter your Gender:");
        char Gender = sc.next().charAt(0);
        System.out.println("Enter your Phone no.");
        int phno = sc.nextInt();
        System.out.println("----------------------------------");
        System.out.println("Name : "+name);
        System.out.println("Age :"+age);
        System.out.println("Gender :"+Gender);
        System.out.println("Phone no. : "+phno);

        System.out.println("give two number :");
        System.out.println("Enter first number : ");
        int a = sc.nextInt();
        System.out.println("Enter second number :");
        int b = sc.nextInt();
        int c = a+b;
        System.out.println("Sum of "+a+" and "+b+" is "+c);

    }

}
