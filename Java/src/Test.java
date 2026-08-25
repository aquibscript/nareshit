public class Test {

    static void main(String[] args) {

        System.out.println(B.k);
    }
}

class A {
    public static int k=10;

    static {
        System.out.println("A Loaded");
    }
}

class B extends A {
    public static int k=20;

    static {
        System.out.println("B Loaded");
    }
}
