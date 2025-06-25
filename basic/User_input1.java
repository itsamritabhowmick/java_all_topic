import java.util.*;

public class User_input1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer value: ");
        int a = sc.nextInt();
        System.out.println("The value of a is: " + a);

        System.out.print("Enter a Floating-Point value: ");
        float f = sc.nextFloat();
        System.out.println("The value of f is: " + f);

        System.out.print("Enter an double value: ");
        double d = sc.nextDouble();
        System.out.println("The value of d is: " + d);

        System.out.print("Enter an Character value: ");
        char c = sc.next().charAt(1);
        System.out.println("The character value is: " + c);

        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("The string is: " + s);

        sc.nextLine();
        System.out.print("Enter another string: ");
        String s1 = sc.nextLine();
        System.out.println("The another string is: " + s1);

        sc.close();
    }
}
