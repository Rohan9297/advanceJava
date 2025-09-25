package OOP.Interfaece;

import java.util.*;

public class LinkedhashSet {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(98);
        for (int i = 0; i < 10; i++) {
            set.add(i);
            set.add(56);
        }

        set.add(90);

        System.out.println(set.toString());
    }
}
