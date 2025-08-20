
public class Sorted {
    public static void main(String[] args) {

        int[] arr = { 10, 23, 44, 56, 67, 89, 900, 99 };
        boolean value = isSorted(arr, 0);
        System.out.println(value);
    }

    private static boolean isSorted(int[] arr, int i) {

        if (arr.length - 1 == i) {
            return true;
        }
        if (arr[i] <= arr[i + 1] && isSorted(arr, i + 1)) {
            return true;
        }

        return false;
    }
}
