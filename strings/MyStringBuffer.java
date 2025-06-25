public class MyStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        // adds a specified string to the end of the stringbuffer
        sb.append("World");
        System.out.println("The string is: " + sb);

        // inserts the specified string at the given position
        sb.insert(4, "language");
        System.out.println("Now the stringg is: " + sb);

        // replace the character with the specified range
        sb.replace(1, 4, "ouly");
        System.out.println("The replacable string is: " + sb);

        // removes the character with the specified range
        sb.delete(1, 4);
        System.out.println("The stringbuffer is after remove specified string: " + sb);

        // reverse the character
        sb.reverse();
        System.out.println("The reverse string is: " + sb);

        // capacity of the stringbuffer
        int cap = sb.capacity();
        System.out.println("The capacity of string is: "+cap);

        //length of the stringbuffer
        int len = sb.length();
        System.out.println("The length of the string is: "+len);

        // sets the length of the string buffer
        sb.setLength(6);
        System.out.println("Now the length of the stringBuffer is: "+sb);

        // apply stringmethods
        StringBuffer sb1 = new StringBuffer("Hello World");
        String str = sb1.toString().toUpperCase();
        sb1 = new StringBuffer(str);
        System.out.println("\nNow the stringbuffer is: " + sb1);
        String str1 = sb1.toString().toLowerCase();
        sb1 = new StringBuffer(str1);
        System.out.println("\nNow the stringbuffer is: " + sb1);

        // charactera At the particular index
        char c = sb.charAt(3);
        System.out.println("\nThe character of the particular index is: " + c);

    }
}
