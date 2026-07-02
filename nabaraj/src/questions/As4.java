package questions;

//Define an object in Java.
/* 
    An object is an instance of a class. It represents a real-world entity and contains data (variables) and behavior (methods) defined by the class. 
    For example, if Person is a class, then person1 is an object of that class.
*/ 

// How is it created? 
/*
    An object is created using the new keyword.

    Syntax:
    ClassName objectName = new ClassName();
*/

//Write a simple class Book and create two objects of it in the main method.
class Book{
    String name;
    double price;
}
public class As4 {
    public static void main(String[] args) {
        Book b = new Book();
        b.name="Java";
        b.price=500;
        System.out.println("Book Name: "+b.name);
        System.out.println("Price: "+b.price);
    }
}
