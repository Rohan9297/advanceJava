package DataStrucure.arrays;

// reverse the array in the k group
public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = { 10, 9, 5, 3, 11, 45, 67, 4 };
        int k = 3;

        int[] result = reverse_Array(arr, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    private static int[] reverse_Array(int[] arr, int k) {

        for (int i = 0; i < arr.length; i += k) {

            int left = i;
            int right = Math.min(left + k - 1, arr.length - 1);

            while (left < right) {

                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return arr;
    }
}
