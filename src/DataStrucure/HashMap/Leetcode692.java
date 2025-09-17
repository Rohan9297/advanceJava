package DataStrucure.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Leetcode692 {
    public static void main(String[] args) {
        String[] words = { "i", "love", "leetcode", "i", "love", "coding" };
        int k = 2;

        List<String> list = topKFrequent(words, k);
        System.out.println(list.toString());
    }

    public static List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        list.sort((a, b) -> {
            int freqCompare = b.getValue().compareTo(a.getValue()); // higher frequency first
            if (freqCompare == 0) {
                return a.getKey().compareTo(b.getKey()); // lexicographical order
            }
            return freqCompare;
        });
        List<String> list2 = new ArrayList<>();
        for (Map.Entry<String, Integer> set : list) {
            if (k <= 0) {
                break;
            }
            list2.add(set.getKey());
        }

        return list2;
    }
}
