package leetcode;

// https://leetcode.com/problems/longest-substring-with-at-least-k-repeating-characters/

import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "aaabb";
        int k = 3;
        System.out.println(longestSubstring(s, k));
    }

    public static int longestSubstring(String s, int k) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        var length = 0;

        for (char c : s.toCharArray()) {
            if (!frequency.containsKey(c)) {
                frequency.put(c, 1);
            } else {
                var count = frequency.get(c);
                frequency.put(c, ++count);
            }
        }

        for (char c : s.toCharArray()) {
            if (frequency.containsKey(c)) {
                var count = frequency.get(c);
                if (count >= k)
                    length += count;

                frequency.remove(c);
            }
        }

        return length;
    }
}
