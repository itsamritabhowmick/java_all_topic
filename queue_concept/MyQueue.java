import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> q = new LinkedList<>();
        int ch;
        int fl = 0;
        char choice = 'n';

        do {
            System.out.println(
                    "\nEnter 1 for Enqueue (add) \nEnter 2 for Dequeue (remove) \nEnter 3 for Display \nEnter 4 for Peek (front element) \nEnter 5 for Is Empty \nEnter 6 for Exit");
            System.out.print("Enter choice: ");
            ch = Integer.parseInt(br.readLine());

            switch (ch) {
                case 1:
                    System.out.print("Enter an element: ");
                    int elem = Integer.parseInt(br.readLine());
                    q.add(elem); // enqueue
                    break;

                case 2:
                    if (!q.isEmpty()) {
                        int removed = q.remove(); // dequeue
                        System.out.println("Removed: " + removed);
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;

                case 3:
                    System.out.println("Current Queue: " + q);
                    break;

                case 4:
                    if (!q.isEmpty()) {
                        System.out.println("Front element: " + q.peek());
                    } else {
                        System.out.println("Queue is Empty");
                    }
                    break;

                case 5:
                    if (q.isEmpty()) {
                        System.out.println("Queue is Empty");
                    } else {
                        System.out.println("Queue is NOT Empty");
                    }
                    break;

                case 6:
                    fl = 1;
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

            if (fl == 1)
                break;

            System.out.print("\nDo you want to continue? (y/n): ");
            String temp = br.readLine();
            if (temp.length() > 0)
                choice = temp.charAt(0);

        } while (choice == 'y' || choice == 'Y');

        br.close();
    }
}
