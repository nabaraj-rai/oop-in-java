package loop;

import java.util.Scanner;

public class ReverseNumber{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int t=n, rev=0;

       while (t!=0){
        int nm = t%10;
        rev = rev*10+nm;
        t = t/10;
       }
       System.out.println("Reversed Number: "+rev);
       if(rev == n){
        System.out.println("It is a palindrome number.");
       }
       else{
        System.out.println("It is not a palinrome number.");
       }
        sc.close();
    }
}