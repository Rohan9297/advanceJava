package DataStrucure.arrays;

import java.util.ArrayList;

public class Wave_Array {
    public static void main(String[] args) {
        // int[] arr = { 2, 4, 7, 8, 9, 10, 12 };

        // wave_Array(arr);
        // for (int i : arr) {
        // System.out.print(i + " ");
        // }

        System.out.println(willvalid());
    }

    private static ArrayList<Integer> willvalid() {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        return list;

    }

    private static void wave_Array(int[] arr) {
        int j = 0;
        for (int i = 1; i < arr.length; i = j) {
            j = i + 1;
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            j++;
        }

    }

    public int[] forwardPackete(int destination, int source, int timestamp) {

        Math.sqrt(56);
        return new int[2];
    }
}
