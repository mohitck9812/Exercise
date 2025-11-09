package Entity;

public class Employee {
    protected int id;
    protected String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: ₹" + calculateSalary());
    }
}
