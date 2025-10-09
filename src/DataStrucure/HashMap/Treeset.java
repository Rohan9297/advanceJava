package DataStrucure.HashMap;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        int[] candyType = { 3, 1, 2, 2, 3, 4 };

        Set<Integer> set = new TreeSet<>();

        for (int num : candyType) {
            set.add(num);
        }

        System.out.println(set.toString());

        int num = popSmallest(set);
        System.out.println(num);
        addBack(5, set);

        System.out.println(set.toString());

    }

    public static int popSmallest(Set<Integer> set) {

        int num = ((TreeSet<Integer>) set).pollFirst();

        return num;
    }

    public static void addBack(int num, Set<Integer> set) {
        set.add(num);
    }
}
