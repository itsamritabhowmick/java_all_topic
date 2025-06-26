import java.util.HashMap;

public class OtherTypes {
    public static void main(String[] args) {
        HashMap<String, Integer> student = new HashMap<>();
        // Creating a hashmap
        student.put("Amrita", 21);
        student.put("Shradhya", 26);
        student.put("Aman", 30);
        student.put("Harry", 25);

        // Display Hashmap
        for (String i : student.keySet()) {
            System.out.println("Name is: " + i + " , Age is: " + student.get(i));
        }
    }
}
