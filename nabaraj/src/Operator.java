

import java.util.Scanner;

public class Operator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Arthmetic Operators:
        System.out.println("Enter 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = sc.nextInt();
        int sum = num1+num2;
        int diff= num1-num2;
        int prod=num1*num2;
        double div = num1/num2;
        double mod = num1%num2;
        System.out.println("Addition = "+sum);
        System.out.println("Subtraction = "+diff);
        System.out.println("Multiplicaion = "+prod);
        System.out.println("Division = "+div);
        System.out.println("Remainder = "+mod);

        //Logical Operator
        boolean a = true;
        boolean b = false;

        // AND (&&)
        System.out.println("a && b = " + (a && b));

        // OR (||)
        System.out.println("a || b = " + (a || b));

        // NOT (!)
        System.out.println("!a = " + (!a));
        System.out.println("!b = " + (!b));

        sc.close();
    }
}
