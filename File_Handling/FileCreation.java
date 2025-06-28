import java.io.*;

public class FileCreation {

    public static void main(String[] args) {
        try {
            File f = new File("amrita.txt");
            if (f.createNewFile()) {
                System.out.println("File created Successfully");
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}