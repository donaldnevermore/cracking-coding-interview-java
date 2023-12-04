package cracking;

import java.util.HashSet;

public class UniqueChar {

    /**
     * Brute force.
     */
    public static boolean isUnique(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        int len = str.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isUniqueUnicode(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        var dict = new HashSet<Character>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (dict.contains(ch)) {
                return false;
            } else {
                dict.add(ch);
            }
        }

        return true;
    }

    public static boolean isUniqueAscii(String str) {
        if (str.length() > 128) {
            return false;
        }

        var charSet = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (charSet[ch]) {
                return false;
            } else {
                charSet[ch] = true;
            }
        }

        return true;
    }

    public static boolean isUniqueLowerLetter(String str) {
        int checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) - 'a';
            if ((checker & (1 << val)) > 0) {
                return false;
            }

            checker |= (1 << val);
        }

        return true;
    }
}
