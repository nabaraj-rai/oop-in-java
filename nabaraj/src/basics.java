import java.util.Scanner;

public class basics {

    public static void main(String[] args) {
        // WAP to add 2 numbers
        int A = 10;
        int B = 20;
        int C = A + B;

        System.out.println("Sum is " + C);

        // WAP to divide 2 numbers and print them on the screen
        C = B / A;
        System.out.println(B + "/" + A + " is " + C);

        // WAP that takes 2 numbers as input and display them
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("Sum of " + num1 + " & " + num2 + " = " + sum);
    }
}
