import java.util.Scanner;

class Solution {
    // public int[] twoSum(int[] nums, int target) {
        
    // }
}

public class Problem01 {

    public static void main(String[] argv) {

        Solution S = new Solution();
        // parse test case
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split(",");
            int target = Integer.parseInt(tokens[1].trim());

            System.out.println(target);
            String[] input_string = tokens[0].split("\\s+");
            int[] inputs = new int[input_string.length]; 

            for (int i = 0; i < inputs.length; i++){
                inputs[i] = Integer.parseInt(input_string[i]); 
                System.out.print(inputs[i] + ", ");
            }
 
            System.out.println(); 
            // TODO: do calculation
            // S.twoSum(nums, target);
        }

    }
}