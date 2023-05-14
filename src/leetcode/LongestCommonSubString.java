package leetcode;

import java.util.HashSet;

public class LongestCommonSubString {
    public static void main(String[] args) {
        String s = "abcabcbb";
        lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> nonDuplicateCharacters = new HashSet<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            var currentChar = s.charAt(i);
            if (!nonDuplicateCharacters.contains(currentChar))
                nonDuplicateCharacters.add(currentChar);
            else {
                length = i;
                break;
            }
        }
        return length;
    }
}
