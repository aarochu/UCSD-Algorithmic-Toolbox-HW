import java.util.Scanner;

public class Change {
    private static int getChange(int m) {
        int num = 0;
       num = m/10;
         m = m%10;
        num = num + m/5;
        m = m%5;
        num = num + m;
        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        System.out.println(getChange(m));

    }
}

