/*
 * This Java source file was generated by the Gradle 'init' task.
 */

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    @Test 
    public void testQustion() {
        Solution sol = new Solution();
        assertEquals(sol.solve(5, 15, 3), "yes");
        assertEquals(sol.solve(13, 25, 2), "no");
    }
}
