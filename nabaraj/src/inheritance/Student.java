package inheritance;

public class Student extends College{
    String studentName = "Anu";
    int roll = 101;

    void displayStudent(){
        System.out.println("Student Name: "+studentName);
        System.out.println("Roll No: "+roll);
    }
}
