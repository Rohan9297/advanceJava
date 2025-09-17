package DataStrucure.arrays;

public class Rotation {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 5, 3, 11, 45, 67, 4 };
        int k = 3;

        rotate_Array(arr, k);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rotate_Array(int[] arr, int k) {

        while (k > 0) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];

            }
            arr[arr.length - 1] = temp;
            k--;
        }

    }
}
