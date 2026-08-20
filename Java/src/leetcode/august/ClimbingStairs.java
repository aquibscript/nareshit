package leetcode.august;

public class ClimbingStairs {

    public static int climbStairs(int n) {
        if(n == 1 || n == 2) {
            return n;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
