import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve {

    public static void main(String[] args) throws IOException {
        // read from stdin
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numLines = Integer.parseInt(reader.readLine());

        while (numLines-- >0) {
            String[] inputs = reader.readLine().split(" ");
            int c = Integer.parseInt(inputs[0]);
            int k = Integer.parseInt(inputs[1]);
            int w = Integer.parseInt(inputs[2]);

            System.out.println(solve(c, k, w));

        }
    }

    private static String solve(int c, int k, int w) {
        if (c*w > k) {
            return "no";
        } else {
            return "yes";
        }
    }

}