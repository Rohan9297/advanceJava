package DataStrucure.Leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Leetcode535 {

    public static void main(String[] args) {
        Solution s = new Solution();

    }
}

class Solution {

    Random random = new Random();
    String base = "http://tinyurl.com/";
    Map<String, String> map = new HashMap<>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getkey();

        map.put(key, longUrl);

        return base + key;

    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {

        String key = shortUrl.replace(base, "");
        return map.get(key);
    }

    public String getkey() {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 6; i++) {

            str.append(chars.charAt(random.nextInt(chars.length())));
        }
        return str.toString();

    }
}
