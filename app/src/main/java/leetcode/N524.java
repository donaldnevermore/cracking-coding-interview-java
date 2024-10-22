package leetcode;

import java.util.List;

class N524 {
    public String findLongestWord(String s, List<String> dictionary) {
        var longest = "";
        for (String word : dictionary) {
            if (longest.length() > word.length()
                    || (longest.length() == word.length() && longest.compareTo(word) < 0)) {
                continue;
            }

            if (isSubstr(s, word)) {
                longest = word;
            }
        }

        return longest;
    }

    private boolean isSubstr(String s, String word) {
        var i = 0;
        var j = 0;
        while (i < word.length() && j < s.length()) {
            if (word.charAt(i) == s.charAt(j)) {
                i++;
            }
            j++;

        }

        return i == word.length();
    }
}
