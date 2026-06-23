package inheritance;

public class Laptop extends Device {
    int ram;

    Laptop(String brand, double price, int ram) {
        super(brand, price);
        this.ram = ram;
    }

    void displayLaptop() {
        displayDetails();
        System.out.println("RAM: " + ram + " GB");
    }
}
