package encapsulation;

public class EncapEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Hari");
        e.setSalary("50000");
        System.out.println("Employee Name: "+e.getName());
        System.out.println("Salary: "+e.getSalary());

    }
}
