public class Student {

    // Attributes
    private String name;
    private int age;

    // constructor
    public Student(String n, int a) {
        this.name = n;
        this.age = a;
    }

    // copy constructor
    public Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    // methods
    @Override
    public String toString() {
        return "Student name is: " + this.name + "\nStudent age is: " + this.age;
    }
}