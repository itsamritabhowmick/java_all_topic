import java.util.ArrayList;
import java.util.Scanner;

public class MyForEach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // create ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        // insert element in the arrayList
        arr.add(56);
        arr.add(12);
        arr.add(96);
        arr.add(5);
        System.out.println("The elements are: " + arr);

        // Use forEach loop here
        for (Integer v : arr) {
            System.out.print(v + "\t");
        }
        System.out.println();

        sc.close();

    }
}
