package com.fra.leetcode;

import java.io.*;
import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int result[] = new int[2];
        int found = 0;
        // int half = (int) Math.floor(target/2);

        // selection search
        for (int k=0; k<nums.length; k++) {
            if (found == 1)
                break;
            for (int s=k; s<nums.length; s++) {
                if (nums[k] + nums[s] == target) {
                    result[0] = k;
                    result[1] = s;
                    found = 1;
                    break;
                }
            }
        }
        return result;
    }
}

public class Problem01 {

    public static void main(String[] argv) throws Exception {

        // pass the path to the file as a parameter 
        File file = new File(argv[0]);
        Scanner sc = new Scanner(file);
        // Scanner sc = new Scanner(System.in);

        Solution S = new Solution();
        // parse test case
        while (sc.hasNext()) {
            // set up scanner
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            // read the target
            int target = Integer.parseInt(tokens[1].trim());

            // read as string
            // DEBUG
            // System.out.println(target);
            String[] input_string = tokens[0].split("\\s+");
            int[] inputs = new int[input_string.length]; 

            // parse the string and store as integers
            for (int i = 0; i < inputs.length; i++){
                inputs[i] = Integer.parseInt(input_string[i]); 
            }
 
            // calculate answers
            int answer[] = S.twoSum(inputs, target);

            // print answer
            System.out.print("Answer: ");
            for (int val: answer)
                System.out.print(val +  " ");

            System.out.println();

        }

        
    }
}