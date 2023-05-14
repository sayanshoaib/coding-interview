package grokking_coding_interview_pattern;

public class ValidPalindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        var chars = s.toCharArray();
        while (start < end) {
            if (chars[start] == chars[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }
}
