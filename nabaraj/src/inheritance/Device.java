package inheritance;

public class Device {
    String brand;
    double price;

    Device(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: Rs. " + price);
    }
}
