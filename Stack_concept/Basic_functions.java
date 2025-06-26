import java.util.Stack;

public class Basic_functions {

    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> st = new Stack<>();

        // ...1st Operation: insert element into the stack....
        st.push(45);
        st.push(23);
        st.push(90);
        st.push(78);
        System.out.println("The elements which are present in the stack: " + st);

        // ...2nd Operation: Delete the top element from the stack....
        int x = st.pop();
        System.out.println("After deleting top element stack is: " + st);
        System.out.println("The deleted element is: " + x);

        // ...3rd Operation: Peek top element....
        System.out.println("Top element is : " + st.peek());

        // ...4th Operation: isEmpty ....check whether the stack is empty or not
        System.out.println("The result is: "+st.isEmpty());

    }
}