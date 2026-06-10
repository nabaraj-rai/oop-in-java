package controlstatements;

import java.util.Scanner;
public class NestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Exam Eligibility ***");

        System.out.println("Have Student enrolled? (true/false): ");
        boolean enrollment = sc.nextBoolean();

        if(enrollment){
            System.out.println("Enter student's Attendance Percentage (0-100): ");
            int attendPer = sc.nextInt();
            if(attendPer>=80){
                System.out.println("Student is eligible");
            }
            else{
                System.out.println("Student is not eligible \n(Attendance Criteria not met)");
            }
        }
        else{
                System.out.println("Student is not eligible \n(Not Enrolled)");
            }
            sc.close();
    }
}
