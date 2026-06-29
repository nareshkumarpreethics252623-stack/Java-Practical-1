class PRACTICALNO1 {

    // Data members
    int num;
    String name;

    // Default Constructor
    PRACTICALNO1() {
        num = 0;
        name = "Default";
    }

    // Parameterized Constructor (Constructor Overloading)
    PRACTICALNO1(int n, String s) {
        num = n;
        name = s;
    }

    // Method to display details
    void display() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
    }

    // Method Overloading
    void add(int a, int b) {
        System.out.println("Sum of two numbers = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers = " + (a + b + c));
    }

    // Static Method
    static void message() {
        System.out.println("This is a static method.");
    }

    // Main Method
    public static void main(String[] args) {

        // Calling static method
        message();

        // Using default constructor
        Demo obj1 = new Demo();
        System.out.println("\nObject 1:");
        obj1.display();

        // Using parameterized constructor
        Demo obj2 = new Demo(101, "Rahul");
        System.out.println("\nObject 2:");
        obj2.display();

        // Calling overloaded methods
        System.out.println("\nMethod Overloading:");
        obj2.add(10, 20);
        obj2.add(10, 20, 30);
    }
}
