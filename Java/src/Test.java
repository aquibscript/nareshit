public class Test {

    static void main(String[] args) {

        System.out.println(new B().sum(1, 2));

        User user = new User("sam");
        // new  => xoxo
        // constructor => parameter(name)
        // xoxo.name
        // (name) = {
        // this.name = name




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

class User {

    String name;
    String email;

    User(String name) {
        name = name;
    }
}