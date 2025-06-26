import java.util.HashSet;

public class MyHashSet {

    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();

        // adding items to a hashset
        cars.add("BMW");
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("lamborgini");
        System.out.println(cars);

        // checking the items exists in the hashset
        boolean b = cars.contains("Ford");
        System.out.println("The checking result is: " + b);

        boolean b1 = cars.contains("Bell");
        System.out.println("The checking result is: " + b1);

        // to find the size of a hashset
        int s = cars.size();
        System.out.println("The size of the hashset is: " + s);

        // to remove an item
        cars.remove("Volvo");
        System.out.println("After removing one item , Hashset is: " + cars);

        // loop through a hashset
        for (String i : cars) {
            System.out.println("Using Loops: " + i);
        }

        // clearing hashset
        cars.clear();
        System.out.println("Now the hashset looks like this: " + cars);
    }
}