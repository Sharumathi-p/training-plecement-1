public class ClimbStairs {
    public static int climbStairs(int n) {
        if (n <= 1) return 1;
        int first = 1, second = 1;
        for (int i = 2; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("Number of ways to climb " + n + " steps: " + climbStairs(n)); // Output: 8
    }
}
