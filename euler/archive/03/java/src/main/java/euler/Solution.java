/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package euler;

public class Solution {
    // public String getGreeting() {
    //     return "Hello world.";
    // }

    public int add(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        // System.out.println(new Solution().getGreeting());
        int a = 2;
        int b = 3;
        Solution sol = new Solution();
        System.out.println("Question : " + Integer.toString(a) + " + " + Integer.toString(b));
        System.out.println("Answer: " + Integer.toString(sol.add(a,b)));
    }
}
