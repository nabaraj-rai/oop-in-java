package loop;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;
        int sum = 0;

        int digits = String.valueOf(n).length();

        while (temp > 0) {
            int digit = temp % 10;
            sum += (int) Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == n) {
            System.out.println(n + " is Armstrong number.");
        } else {
            System.out.println(n + " is not Armstrong number.");
        }

        sc.close();
    }
}