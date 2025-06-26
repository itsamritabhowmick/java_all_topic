import java.util.HashMap;

public class MyHashzmap {

    public static void main(String[] args) {

        // Creating a hashmap
        HashMap<String, String> city = new HashMap<>();

        // adding items to hashmap
        city.put("England", "London");
        city.put("USA", "washington Dc");

        // display using foreach loop
        for (String s : city.keySet()) {
            System.out.println("key is: " + s + "\nvalue is: " + city.get(s));
        }
        for (String s : city.values()) {
            System.out.println("value is: " + s); ///show only values
        }

        // accessing items from hashmap
        System.out.println("value is: " + city.get("England"));

        // to find the size of a hashmap
        city.size();
        System.out.println(city.size());

        // removing an items from hashmap
        city.remove("USA");
        System.out.println(city);

        // clearing hashmap
        city.clear();
        System.out.println(city);
    }
}