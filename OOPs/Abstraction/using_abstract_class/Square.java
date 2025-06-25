public class Square extends Shape {

    // Attributes
    private int side;
    private int area;

    // use constructors
    public Square() {
        this.side = 0;
        this.area = 0;
    }

    public Square(int s) {
        this.side = s;
        this.area = 0;
    }

    // methods
    @Override
    public void calculateArea() {
        area = side * side;
    }

    @Override
    public void display() {
        System.out.println("The area is : " + area);
    }
}
