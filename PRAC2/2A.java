package practical.no.pkg2;

abstract class Shape {

    abstract void draw();

    void display() {
        System.out.println("Displaying Shape");
    }
}

class Circle extends Shape {

    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class PRACTICALNO2 {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.draw();
        c.display();
    }
}
