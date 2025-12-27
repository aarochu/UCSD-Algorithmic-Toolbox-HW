import java.util.*;

public class LCM {
  private static long lcm_naive(int a, int b) {
    return (long) a * b / GCD.gcd_naive(a, b);
  }

  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();

    System.out.println(lcm_naive(a, b));
  }
}

class GCD {
  static int gcd_naive(int a, int b) {
    if (b == 0) {
      return a;
    } else {
      return gcd_naive(b, a % b);
    }
  }
}

