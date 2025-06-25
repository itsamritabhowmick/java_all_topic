public class Main {
    public static void main(String[] args) {
        Pen p = new Pen();
        p.company = "Reynolds";
        p.color = "Red";
        p.type = "BallPen";
        p.write();
        p.refill();
        p.display();
    }
}
