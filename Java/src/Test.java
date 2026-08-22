public class Test {

    static void main(String[] args) {
        /*
         *
         * *
         * * *
         * *
         *
         */

        int next = 0;

        for (int i = 1; i <= 9; i++) {
            if(i > 5) {
                next++;
            }
            for (int j = 1; j < i - next; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
