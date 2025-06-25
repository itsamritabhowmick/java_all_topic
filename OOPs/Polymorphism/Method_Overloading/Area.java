import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
    public int calculateArea(int s) {
        int res = s * s;
        return res;
    }

    public int calculateArea(int length, int breadth) {
        int res = length * breadth;
        return res;
    }

    public double calculateArea(double radius) {
        double res = Math.PI * radius * radius;
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // for square
        System.out.println("Enter side: ");
        int a = Integer.parseInt(br.readLine());
        Area obj = new Area();
        int res = obj.calculateArea(a);
        System.out.println("The area of square is: " + res);

        // for rectangle
        System.out.println("Enter length: ");
        int l = Integer.parseInt(br.readLine());
        System.out.println("Enter breadth: ");
        int b = Integer.parseInt(br.readLine());
        int res1 = obj.calculateArea(l, b);
        System.out.println("The area of rectangle is: " + res1);

        // for circle
        System.out.println("Enter radius");
        double r = Double.parseDouble(br.readLine());
        double res3 = obj.calculateArea(r);
        System.out.println("The area of circle is: " + res3);

        br.close();
    }
}