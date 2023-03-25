package cracking;

import java.util.HashSet;

public class UniqueChar {
    public static boolean isUnique(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        var len = str.length();

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
            var ch = str.charAt(i);
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

        var array = new boolean[128];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (array[ch]) {
                return false;
            } else {
                array[ch] = true;
            }
        }

        return true;
    }

    public static boolean isUniqueLowerLetter(String str) {
        // Only 26 characters
        if (str.length() > 26) {
            return false;
        }

        var checker = 0;

        for (int i = 0; i < str.length(); i++) {
            int value = str.charAt(i) - 'a';
            if ((checker & (1 << value)) > 0) {
                return false;
            }

            checker |= (1 << value);
        }

        return true;
    }
}
