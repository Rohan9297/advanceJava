package DataStrucure.recursion;

// import java.util.ArrayList;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = { 10, 34, 45, 63, 54, 67, 67, 788, 89 };

        int target = 67;

        System.out.println(binarySearch(arr, 0, arr.length - 1, target));
        // System.out.println(linearSearch(arr, 0, target));
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<Integer> arraylist = (linearSearch(arr, 0, target, new
        // ArrayList<>()));
        // System.out.println(arraylist);
        // System.out.println(list);

    }

    // private static ArrayList<Integer> linearSearch(int[] arr, int index, int
    // target, ArrayList<Integer> list) {

    // if (arr.length - 1 <= index) {
    // return list;
    // }
    // if (target == arr[index]) {
    // list.add(index);
    // }
    // return linearSearch(arr, index + 1, target, list);

    // }

    // private static int linearSearch(int[] arr, int index, int target) {

    // if (arr.length - 1 <= index) {
    // return -1;
    // }
    // if (target == arr[index]) {
    // return index;
    // }
    // return linearSearch(arr, index + 1, target);
    // }

    static int binarySearch(int[] arr, int start, int end, int target) {

        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (start > arr[mid]) {

            return binarySearch(arr, start, mid - 1, target);
        }

        return binarySearch(arr, mid + 1, end, target);
    }

}
