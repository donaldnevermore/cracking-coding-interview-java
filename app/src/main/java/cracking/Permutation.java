package cracking;

import java.util.HashMap;
import java.util.Arrays;

public class Permutation {
    public static boolean isPermutationAscii(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }

        // Provided ASCII String.
        int[] letters = new int[128];

        for (int i = 0; i < first.length(); i++) {
            var ch = first.charAt(i);
            letters[ch]++;
        }

        for (int i = 0; i < second.length(); i++) {
            var ch = second.charAt(i);
            letters[ch]--;

            if (letters[second.charAt(i)] < 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean isPermutationUnicode(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }

        return sort(first).equals(sort(second));
    }

    private static String sort(String str) {
        char[] array = str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static boolean isPermutationMap(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (first.length() != second.length()) {
            return false;
        }

        var letters = new HashMap<Character, Integer>();

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) + 1);
            } else {
                letters.put(ch, 1);
            }
        }

        for (int i = 0; i < second.length(); i++) {
            char ch = second.charAt(i);
            if (letters.containsKey(ch)) {
                letters.put(ch, letters.get(ch) - 1);

                if (letters.get(ch) < 0) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
}
