package practical.no.pkg1;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PRACTICALNO1 {

    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println("Parent Class:");
        a.sound();

        System.out.println("\nChild Class:");
        d.sound();
    }
}package practical.no.pkg1;

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PRACTICALNO1 {

    public static void main(String[] args) {

        Animal a = new Animal();
        Dog d = new Dog();

        System.out.println("Parent Class:");
        a.sound();

        System.out.println("\nChild Class:");
        d.sound();
    }
}
