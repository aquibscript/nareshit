public class Test {

    static void main(String[] args) {
        System.out.println(new B().sum);
    }
}

class A {
    public int sum;

    static {
        System.out.println("A Loaded");
    }
}

class B extends A {
    public int sum;

    static {
        System.out.println("B Loaded");
    }
}
