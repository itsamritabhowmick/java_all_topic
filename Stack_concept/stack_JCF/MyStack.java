import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.EmptyStackException;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> sta = new Stack<>();
        int ch;
        int fl = 0;
        char choice = 'n';

        do {
            System.out.println(
                    "\nEnter 1 for push \nEnter 2 for pop \nEnter 3 for display \nEnter 4 for peak \nEnter 5 for is_Empty \nEnter 6 for Exit");
            System.out.println("Enter choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    System.out.println("\nEnter an element: ");
                    int elem = Integer.parseInt(br.readLine());
                    sta.push(elem);
                    break;

                case 2:
                    try {
                        int x = sta.pop();
                        System.out.println(x);
                    } catch (EmptyStackException e) {
                        System.out.println("Stack Underflow");
                    }
                    break;

                case 3:
                    System.out.println(sta);
                    break;

                case 4:
                    try {
                        System.out.println(sta.peek());
                    } catch (EmptyStackException e) {
                        System.out.println("stack is Empty. Nothing is display");
                    }
                    break;
                case 5:
                    if (sta.isEmpty()) {
                        System.out.println("Stack is Empty");
                    } else {
                        System.out.println("The stack is not empty");
                    }
                    break;

                case 6:
                    fl = 1;
                    break;
            }
            if (fl == 1) {
                break;
            }
            System.out.println("\nDo you want to continue this??");
            choice = br.readLine().charAt(0);
        } while (choice == 'y' || choice == 'Y'); // while (ch >= 1 && ch <=6);
        // br.close();
    }
}
