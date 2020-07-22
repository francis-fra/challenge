// interface ProblemParser<T, S> {
//     public boolean more?();
//     public T[] get_input();
//     public S get_target(); 
// }

// class parser implements ProblemParser<T, S> {

//     private Scanner sc;

//     parser() {
//         this.sc = new Scanner(System.in);
//     }

//     public boolean more?() {
//         return this.sc.hasNext();
//     }

//     public T[] get_input() {

//     }

//     public S get_target() {
//         if (this.more?()) {
//             String line = this.sc.nextLine();
//             String[] tokens = line.split(",");
//             S theClass = new S; 
//             S target = theClass.parseInt(tokens[1].trim());
//         }
//     }

// }
import java.text.NumberFormat;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class parser {

    public static void main(String[] argv) throws Exception {

        // Integer something = new Integer(123);
        String something = "123.9";
        // String theType = "java.lang.Number";
        // Class<? extends Number> theClass = Class.forName(theType).asSubclass(Number.class);
        // Number obj = theClass.cast(something);
        // Integer a = (Integer) something;

        Number num = NumberFormat.getInstance().parse(something);
        Double d = num.doubleValue();
        Float f = num.floatValue();
        int k = num.intValue();
        // Float f = NumberFormat.getInstance().parse(num);

        System.out.println(d);
        System.out.println(f);
        System.out.println(k);
        System.out.println(num);
    }
}
