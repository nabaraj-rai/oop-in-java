
import java.util.Scanner;
public class Assignmt1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 54;
        int num2 = 2;
        //WAP to divide two numbers and print them on the screen.
        double div = num1/num2;
        System.out.println(num1+" / "+num2+" = "+div);


        //WAP that takes two numbers as input and displays the product of two numbers.
        System.out.println("Enter the first number: ");
        num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        num2 = sc.nextInt();
        int prod = num1*num2;
        System.out.println("The product of "+num1+" & "+num2+" is "+prod);
        sc.close();
    }
}
