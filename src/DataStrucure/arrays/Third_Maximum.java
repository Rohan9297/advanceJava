package Leetcode.arrays;

public class Third_Maximum {
    public static void main(String[] args) {
        int[] arr = { 12, 34, 53, 54, 23, 67 };

        int result = third_Maximum(arr);
        System.out.println(result);
    }

    private static int third_Maximum(int[] arr) {
        int first_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first_max)
                first_max = arr[i];
        }

        int second_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > second_max && arr[i] < first_max)
                second_max = arr[i];
        }

        int third_max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > third_max && arr[i] < second_max)
                third_max = arr[i];
        }

        return third_max;
    }
}
