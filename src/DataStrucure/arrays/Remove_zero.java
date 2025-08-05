package DataStrucure.arrays;

public class Remove_zero {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 0, 4, 3, 0, 5, 0 };
        int[] result = remove_zero(arr);

        for (int i : result) {
            System.out.println(i + " ");
        }

    }

    private static int[] remove_zero(int[] arr) {

        int index = 0;
        for (int num : arr) {
            if (num > 0) {
                arr[index] = num;
                index++;
            }
        }
        return arr;

    }
}
