package leetcode;

// https://leetcode.com/problems/valid-palindrome/

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int j = str.length() - 1;

        for (int i  = 0;  i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(j)){
                return false;
            }
            j--;
        }

        return true;
    }
}
