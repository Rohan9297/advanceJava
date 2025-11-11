package DataStrucure.arrays;

import java.util.*;

public class WaterFountain {
    public int findStartFountain(int[] water, int[] cost) {
        int totalWater = 0;
        int currentWater = 0;
        int startIndex = 0;
        int n = water.length;

        for (int i = 0; i < n; i++) {
            totalWater += water[i] - cost[i];
            currentWater += water[i] - cost[i];

            if (currentWater < 0) {
                startIndex = i + 1;
                currentWater = 0;
            }
        }

        // If total water is negative, it’s impossible to complete the circle
        if (totalWater < 0) {
            return -1;
        }

        return startIndex;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example: input arrays from user
        int n = sc.nextInt();
        int[] water = new int[n];
        int[] cost = new int[n];

        for (int i = 0; i < n; i++) {
            water[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            cost[i] = sc.nextInt();
        }

        WaterFountain wf = new WaterFountain();
        int start = wf.findStartFountain(water, cost);
        System.out.println(start);
    }
}
