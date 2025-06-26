public class Main {
    public static void main(String[] args) {
        Student s = new Student("Riya", 23);
        System.out.println(s);
        Student s1 = new Student(s);
        System.out.println(s1);
    }
}
