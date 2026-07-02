package inheritance;

public class Hierachicalinherit {
    public static void main(String[] args) {
        Desktop d = new Desktop();
        Lapop1 l = new Lapop1();
        d.poweron();
        d.workstation();
        l.poweron();
        l.portable();
    }
}
