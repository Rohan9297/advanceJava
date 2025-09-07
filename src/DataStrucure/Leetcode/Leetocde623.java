package DataStrucure.Leetcode;

public class Leetocde623 {

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlowers(arr, 1));

    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {

        for (int i = 0; i < flowerbed.length; i++) {

            if (n <= 0) {
                return true;
            }

            if (flowerbed[i] == 0) {

                boolean left = (i == 0 || flowerbed[i - 1] == 0);
                boolean right = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);

                if (left && right) {
                    flowerbed[i] = 1;
                    n--;

                }

            }
        }

        return n <= 0;
    }

}
