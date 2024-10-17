interface A {
    static class B {
        void show() {
            System.out.println("Hello");
        }
    }
}

public class Interface {
    public static void main(String[] args) {
        A.B k = new A.B();
        k.show(); // This will print "Hello"
    }
}
