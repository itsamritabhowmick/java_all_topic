import java.io.*;

public class User_input2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a string: ");
        String s1 = br.readLine();
        System.out.println("The string is: " + s1);

        System.out.println("Enter a floating value: ");
        String f = br.readLine();
        float ff = Float.parseFloat(f);
        System.out.println("The floating point nummber is : " + ff);

        // float f = Float.parseFloat(br.readLine());

        br.close();
    }
}
