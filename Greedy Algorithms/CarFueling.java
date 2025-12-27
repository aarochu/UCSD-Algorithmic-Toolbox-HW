import java.util.*;

public class CarFueling {
    static int computeMinRefills(int dist, int tank, int[] stops) {
        int[] allStops = new int[stops.length + 2];
        allStops[0] = 0;
        System.arraycopy(stops, 0, allStops, 1, stops.length);
        allStops[allStops.length - 1] = dist;
        int current = 0;
        int refills = 0;
        while (current < allStops.length - 1) {
            int last = current;
            while (current < allStops.length - 1 && allStops[current + 1] - allStops[last] <= tank) {
                current++;
            }
            if (current == last) {
                return -1;
            }
            if (current < allStops.length - 1) {
                refills++;
            }
        }
        return refills;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dist = scanner.nextInt();
        int tank = scanner.nextInt();
        int n = scanner.nextInt();
        int stops[] = new int[n];
        for (int i = 0; i < n; i++) {
            stops[i] = scanner.nextInt();
        }

        System.out.println(computeMinRefills(dist, tank, stops));
    }
}
