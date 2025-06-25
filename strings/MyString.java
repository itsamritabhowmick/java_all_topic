import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyString {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter a String: ");
        String str = br.readLine();
        System.out.println("The string is: " + str);

        // to get the length of the string
        int len = str.length();
        System.out.println("the length of string is: " + len);

        // to get the character of the specified index
        char c = str.charAt(2);
        System.out.println("The specified character is: " + c);

        // Extracts a substring starting from beginning index upto end index
        String sub = str.substring(2, 8);
        System.out.println("Now the substring is: " + sub);

        // checks the string contains specified sequence
        boolean b = str.contains("world");
        System.out.println("It is: " + b);
        boolean b1 = str.contains("hello");
        System.out.println("It is: " + b1);

        // compare two strings for equality
        String comp1 = "Hello";
        String comp2 = "world";
        boolean iseq = comp1.equals(comp2);
        System.out.println("Compare result is: " + iseq);

        // compare two strings for equality also ignoring case difference
        comp1 = "Hello";
        String comp3 = "hello";
        boolean iseq1 = comp1.equalsIgnoreCase(comp3);
        System.out.println("Here the result is: " + iseq1);

        // compares two string lexicographically
        String lex1 = "apple";
        String lex2 = "banana";
        String lex3 = "apple";
        // if s1<s2-->(+)
        int co = lex1.compareTo(lex2);
        // if s1>s2-->(-)
        int co1 = lex2.compareTo(lex3);
        // if s1=s2-->(0)
        int co2 = lex1.compareTo(lex3);

        // converts all characters into uppercase
        String upcase = lex1.toUpperCase();
        System.out.println("The Uppercase string is: " + upcase);

        // converts all characters into lowercase
        String ll = "ASDFR";
        String lowcase = ll.toLowerCase();
        System.out.println("The Uppercase string is: " + lowcase);

        // replace all occurences of a specified character with a new character
        String rep = lex1.replace('a', 'o');
        System.out.println("The replacable string is: " + rep);

        // replace the string into another
        String str2 = "Graham Bell";
        String repla = str2.replace("Bell", "Kabo");
        System.out.println("The another relacable string is: " + repla);

        // get the index of the first ocurrence of the specified character
        int occ = lex1.indexOf('p');
        System.out.println("The index of the first ocurrence of the specified character: " + occ);

        // get the index of the last ocurrence of the specified character
        int occ1 = lex1.lastIndexOf('p');
        System.out.println("The index of the last ocurrence of the specified character: " + occ1);

        // checks the string starts with specified prefix
        boolean sw = str2.startsWith("Graham");
        System.out.println("Start result is: " + sw);

        // checks the string ends with specified prefix
        boolean ew = str2.endsWith("Graham");
        System.out.println("\nEnd result is: " + ew);

        // remove leading and trailing whitespaces from string
        String str3 = "   Hello   World   ";
        String tm = str3.trim();
        System.out.println("\nThe trim string is: " + tm);

        // converts the string into character array
        String st1 = "hello, world!";
        char[] arr = st1.toCharArray();
        System.out.println("The character array is: ");
        for (char ca : arr) {
            System.out.println(ca + " ");
        }

        // checks the string is empty or not
        String isEmp = " ";
        boolean iE = isEmp.isEmpty();
        System.out.println("The resultant string is: " + iE);

        // splits the string
        String[] words = st1.split(" ");
        for (String st : words) {
            System.out.println("The split string is: " + st + " ");
        }

        br.close(); // amrita world
    }
}