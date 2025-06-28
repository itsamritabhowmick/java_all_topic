import javax.swing.JOptionPane;

public class ConfirmDialog {
    public static void main(String[] args) {
        int result = JOptionPane.showConfirmDialog(null, "Are you confirm??", "Decision Box",
                JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
