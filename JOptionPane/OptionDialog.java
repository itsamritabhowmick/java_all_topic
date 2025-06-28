import javax.swing.JOptionPane;

public class OptionDialog {
    public static void main(String[] args) {

        // custom Options for dialog box
        String[] options = { "op1", "op2", "op3", "op4" };
        int choice = JOptionPane.showOptionDialog(null, "choose your options: ", "choose box",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        JOptionPane.showMessageDialog(null, choice);
    }
}
