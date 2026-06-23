package inheritance;

public class Mobile extends Device{
    String model;

    Mobile(String brand, double price, String model) {
        super(brand, price);
        this.model = model;
    }

    void displayMobile() {
        displayDetails();
        System.out.println("Model: " + model);
    }
}
