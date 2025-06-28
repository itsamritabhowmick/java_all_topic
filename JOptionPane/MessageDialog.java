import javax.swing.JOptionPane;

public class MessageDialog {
    public static void main(String[] args) {
        // 1st Type-: information
        JOptionPane.showMessageDialog(null, "My Name is Amrita", "Bio", JOptionPane.INFORMATION_MESSAGE);

        // 2nd Type: Warning
        JOptionPane.showMessageDialog(null, "It is wrong direction", "Danger", JOptionPane.WARNING_MESSAGE);

        // 3rd Type: Error
        JOptionPane.showMessageDialog(null, "This code give an error", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
