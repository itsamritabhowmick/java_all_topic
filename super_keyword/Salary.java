public class Salary extends Employee {

    // Attributes
    private int gross;

    // constructor
    public Salary(String n, int b) {
        super(n, b); // ........calling parent class constructor
        this.gross = 0;
    }

    // methods
    public void show() {
        System.out.println("The salary is: " + super.basic); // ...... accessing parent class field
    }

    public void display() {
        super.display(); // .........calling parent class method
    }
}
