package exercise;

public class EulerProblem12 {

  public static int countFactors(Long num) {
    // find the number of factors of a given number

    Long sqrtLimit = (long) Math.sqrt(num);
    int count = 1;
    for (Long k=2L; k<=sqrtLimit; k++) {
      if (num % k == 0)
        count++;
    }

    if (num % sqrtLimit == 0)
      return ((count-1)*2+1);
    else
      // even
      return (2*count);
  }

  public static Long findFirstTriDivsor(int N) {
    // find the first triangle number ot have over N number of divisors

    int num_triangle_limit = 10;
    Long increment = 1L;
    Long current = 0L;
    while (Boolean.TRUE) {
      current += increment;
      increment += 1;
      int count = countFactors(current);
      if (count > N)
        break;
      // System.out.println(current);
    }

    return (current);

  }

  public static void main(String[] args) {

    int N = Integer.parseInt(args[0]);
    Long answer = findFirstTriDivsor(N);
    System.out.println(answer);


    // System.out.println("You typed: " +  Long.toString(N));

    // int count = countFactors(N);
    // System.out.println("Num factors: " +  Long.toString(count));

    // generate triangle numbers
    // int num_triangle_limit = 10;
    // Long current = 0L;
    // for (int k=1; k<num_triangle_limit; k++) {
    //   current += k;
    //   System.out.println(current);
    // }

  }

}
