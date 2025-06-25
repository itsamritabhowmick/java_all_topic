public class MultiLevel {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Dog d = new Dog();
        d.makeSound();
        d.eat();
        Puppy p = new Puppy();
        p.makeSound();

    }
}
