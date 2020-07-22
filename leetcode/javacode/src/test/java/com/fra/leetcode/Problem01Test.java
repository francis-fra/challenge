package com.fra.leetcode;

import org.junit.*;
import static org.junit.Assert.*;
// import java.io.ByteArrayOutputStream;
// import java.io.PrintStream;

public class Problem01Test {

    @Test
    public void test01() {
        int input[] = {2, 7, 11, 15};
        int target = 9;
        Solution S = new Solution();
        int result[] = S.twoSum(input, target);

        assertEquals(input[result[0]] + input[result[1]], target);
    };

    @Test
    public void test02() {
        int input[] = {2, 9, 11, 5, 7, 6};
        int target = 16;
        Solution S = new Solution();
        int result[] = S.twoSum(input, target);

        assertEquals(input[result[0]] + input[result[1]], target);
    };
}