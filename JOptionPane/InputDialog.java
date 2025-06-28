import javax.swing.JOptionPane;

public class InputDialog {
    public static void main(String[] args) {
        try {
            String name = JOptionPane.showInputDialog(null, "Enter your name: ", "Input Box",
                    JOptionPane.QUESTION_MESSAGE);

            String age = JOptionPane.showInputDialog(null, "Enter your age: ", "Age box",
                    JOptionPane.QUESTION_MESSAGE);
            int agee = Integer.parseInt(age);

            //Display Message
            JOptionPane.showMessageDialog(null, "Hello " + name + " , your age is: " + age, "ResultShowBox",
                    JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            System.out.println("Exception Occur");
        }

    }
}
