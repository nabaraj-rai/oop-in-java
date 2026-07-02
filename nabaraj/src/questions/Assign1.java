package questions;

class Person {
    // Private instance variables
    private String name;
    private int age;
    private String country;

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

public class Assign1 {
    public static void main(String[] args) {
        Person p = new Person();

        p.setName("John");
        p.setAge(25);
        p.setCountry("Nepal");

        System.out.println("Name: " + p.getName());
        System.out.println("Age: " + p.getAge());
        System.out.println("Country: " + p.getCountry());
    }
}
