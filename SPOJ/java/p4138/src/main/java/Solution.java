/*
 * This Java source file was generated by the Gradle 'init' task.
 */
// package p4138;

public class Solution {

    public String solve(int c, int k, int w) {
        if (c*w > k) {
            return "no";
        } else {
            return "yes";
        }
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solve(5, 15, 3));
    }
}