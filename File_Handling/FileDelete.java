import java.io.File;

public class FileDelete {
    public static void main(String[] args) {
        File f = new File("amrita.txt");
        if (f.delete()) {
            System.out.println("Deleted file is: "+f.getName());
        }
        else{
            System.out.println("Failed to delete the file");
        }
    }
}
