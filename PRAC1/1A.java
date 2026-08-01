class PRACTICALNO1 {
  
    int num;
    String name;

    PRACTICALNO1() {
        num = 0;
        name = "Default";
    }

    PRACTICALNO1(int n, String s) {
        num = n;
        name = s;
    }

    void display() {
        System.out.println("Number: " + num);
        System.out.println("Name: " + name);
    }

    void add(int a, int b) {
        System.out.println("Sum of two numbers = " + (a + b));
    }

    void add(int a, int b, int c) {
        System.out.println("Sum of three numbers = " + (a + b + c));
    }
  
    static void message() {
        System.out.println("This is a static method.");
    }


    public static void main(String[] args) {
        message();
      
        Demo obj1 = new Demo();
        System.out.println("\nObject 1:");
        obj1.display();

        Demo obj2 = new Demo(101, "Rahul");
        System.out.println("\nObject 2:");
        obj2.display();

        System.out.println("\nMethod Overloading:");
        obj2.add(10, 20);
        obj2.add(10, 20, 30);
    }
}
