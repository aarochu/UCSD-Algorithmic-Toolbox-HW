import java.util.*;

public class FibonacciLastDigit {
    private static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 2; i <= n; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = (tmp_previous + current) % 10;
            System.out.println("i: " + i + " current last digit: " + current + " previous last digit: " + previous);
        }

        return current;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}

