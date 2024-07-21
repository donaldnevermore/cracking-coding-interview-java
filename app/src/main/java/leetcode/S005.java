package leetcode;

public class S005 {
    private int longest = 1;
    private int position = 0;

    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        for (int i = 0; i < s.length(); i++) {
            findLongest(s, i - 1, i + 1);
            findLongest(s, i, i + 1);
        }

        return s.substring(position, position + longest);
    }

    private void findLongest(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            final int distance = right - left + 1;
            if (distance > longest) {
                longest = distance;
                position = left;
            }
            left--;
            right++;
        }
    }
}
