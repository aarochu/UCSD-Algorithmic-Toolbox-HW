import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int count = 0;
        while (capacity > 0 && count < values.length) {
        int index = 0;
        double temp = 0;
    for (int i = 0; i < values.length; i++) {
        if(weights[i] > 0 && (double)values[i]/weights[i] > temp){
            index = i;
            temp = (double)values[i]/weights[i];
        }
    }
    int temp2 = capacity;
    if(capacity>=weights[index]){
        temp2 = weights[index];
    }
     value = value + temp2 * ((double)values[index]/weights[index]);
     capacity = capacity - temp2;
    // weights[index] -= temp2;
     values[index]=0;
     count++;
    }
        return value;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
