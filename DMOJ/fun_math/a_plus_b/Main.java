/*
 * sample input:
    2
    1 1
    -1 0
*/
import java.io.*;
import java.util.*;

class Solution {

    static int solve(int a, int b) {
        return a + b;
    }

    static void write(int answer) {
        System.out.println(answer);
    }

    static void write_to_file(int answer, String out_file_name) {

        try {
            FileOutputStream f = new FileOutputStream(out_file_name, true);
            System.setOut(new PrintStream(f));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(answer);
    }

}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // parse number of questions
        // int num_questions = sc.nextInt();
        String line = sc.nextLine();
        int num_questions = Integer.parseInt(line);

        while (sc.hasNext()) { 
            // parse inputs
            line = sc.nextLine();
            String[] tokens = line.split(" ");
            int first_num = Integer.parseInt(tokens[0].trim());
            int second_num = Integer.parseInt(tokens[1].trim());

            // solve it
            int answer = Solution.solve(first_num, second_num);
            // write it
            Solution.write(answer);
            // S.write_to_file(answer, "output-file.txt");

        }


    }
}