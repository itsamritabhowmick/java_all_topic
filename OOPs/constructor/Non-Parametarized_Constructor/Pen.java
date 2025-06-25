public class Pen {

    // Attributes
    String company;
    String color;
    String type;

    // Use Constructor
    public Pen() {
        this.company = "";
        this.color = "";
        this.type = "";
    }

    // methods
    public void write() {
        System.out.println("Writting Content");
    }

    public void display() {
        System.out.println("Pen Company is: " + this.company);
        System.out.println("Pen Color is: " + this.color);
        System.out.println("Pen Type is: " + this.type);
    }
}