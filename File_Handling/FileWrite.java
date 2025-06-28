import java.io.BufferedWriter;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileWrite {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("amrita.txt"));
            bw.write("eritting this line in file");
            JOptionPane.showMessageDialog(null, "Written to file successfully", "File Write", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            System.out.println("Error Occured");
            e.printStackTrace();
        }
    }
}
