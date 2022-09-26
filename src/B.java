public class B extends A {
    public static void sound() {
        System.out.println("Roar");
    }

    public static void main(String[] args) {
        A a = new B();
        a.sound();
    }
}
