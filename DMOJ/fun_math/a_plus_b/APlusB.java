import java.util.*;

class Solution {
    public static int solve(int a, int b) {
        return a + b;
    }
}
public class APlusB {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int answer = Solution.solve(a, b);
            System.out.println(answer);
        }
    }
}
