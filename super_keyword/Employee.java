public class Employee {

    // Attributes
    protected String name;
    protected int basic;

    // constructors
    public Employee(String n, int b) {
        this.name = n;
        this.basic = b;
    }

    // methods
    public void display() {
        System.out.println("Employee Name is: " + this.name);
        System.out.println("Employee Salary is: " + this.basic);
    }
}