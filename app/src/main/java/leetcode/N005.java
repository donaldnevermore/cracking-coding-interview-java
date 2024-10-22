package leetcode;

public class N005 {
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

    public String longestPalindromeDP(String s) {
        int len = s.length();
        var dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }

        int longest = 1;
        int position = 0;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                boolean isEqual = s.charAt(j) == s.charAt(i);
                if (i - j <= 1) {
                    dp[j][i] = isEqual;
                } else {
                    dp[j][i] = isEqual && dp[j + 1][i - 1];
                }

                int distance = i - j + 1;
                if (dp[j][i] && longest < distance) {
                    longest = distance;
                    position = j;
                }
            }
        }

        return s.substring(position, position + longest);
    }
}
