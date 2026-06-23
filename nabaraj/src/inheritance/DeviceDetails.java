package inheritance;

public class DeviceDetails {
    public static void main(String[] args) {

        Mobile m = new Mobile("Samsung", 50000, "Galaxy A56");

        Laptop l = new Laptop("Dell", 85000, 16);

        System.out.println("Mobile Phone Details:");
        m.displayMobile();

        System.out.println("\nLaptop Details:");
        l.displayLaptop();
    }
}
