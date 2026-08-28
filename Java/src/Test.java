public class Test {

    static void main(String[] args) {

        System.out.println(new B().sum(1, 2));
    }
}

class A {
    public static int k=10;

    static {
        System.out.println("A Loaded");
    }

    int sum (int a, int b) {
        return a + b;
    }
}

class B extends A {
    public static int k=20;

    static {
        System.out.println("B Loaded");
    }

//    String sum (int a, int b) {
//        return "hi";
//    }
}
