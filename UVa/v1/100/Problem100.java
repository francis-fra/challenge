/* 
Sample Input
    1  10
    100  200
    201  210
    900  1000

Sample Output
    1  10  20
    100  200  125
    201  210  89
    900  1000  174
*/
import java.util.Scanner;

// interface LineParser<T> {
//     public boolean more?();
//     public T[] getNext();
// }

// class StreamParser<Integer> implements LineParser<Integer> {

//     StreamParser()
//     Scanner sc = new Scanner(System.in);
//     while (sc.hasNext()) {
//         String line = sc.nextLine();
//         String[] tokens = line.split("\\s+");
    
// }

public class Problem100 {

    public static void main(String[] argv) {
        // read inputs
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] tokens = line.split("\\s+");
            int first_num = tokens[0];
            int second_num = tokens[1];

            // TODO: process algorithm

            // TODO: print outputs
            System.out.printf("%s %s\n", first_num, second_num);
        }
    }
}