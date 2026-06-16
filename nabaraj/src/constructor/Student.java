package constructor;

/*

Constructor Overloading is the process of defining multiple constructors in the same class with different parameter lists to initialize objects in different ways. 

*/

public class Student {
    Student(){
        System.out.println("Default Constructor");
    }
    Student(String name){
        System.out.println("Name: "+name);
    }
    Student(String name, int roll){
        System.out.println("Name: "+name);
        System.out.println("Roll: "+roll);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ram");
        Student s3 = new Student("Sita",101);
    }
}
