package corejava.part2.methods;

public class Introduction {
    public  static  int count = 0;
    public void change( ) {
        count++;
    }

    static int x = 10;
    static void main(String[] args) {
        /*


        */
        Introduction a1 = new Introduction();
        Introduction b1 = new Introduction();
        a1.change();


        System.out.println(b1.count);

    }
}
