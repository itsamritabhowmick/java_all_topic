import java.io.BufferedReader;
import java.io.FileReader;

public class FileReading {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("amrita.txt"));
            String Line;
            while ((Line = br.readLine()) != null) {
                System.out.println(Line);
            }

        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
