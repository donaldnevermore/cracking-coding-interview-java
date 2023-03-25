package cracking;

public class OneEditAway {
    public static boolean is(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (first.length() == second.length()) {
            return oneEditReplace(first, second);
        }

        if (first.length() + 1 == second.length()) {
            return oneEditInsert(first, second);
        }

        if (first.length() - 1 == second.length()) {
            return oneEditInsert(second, first);
        }

        return false;
    }

    public static boolean is2(String first, String second) {
        if (first == null || second == null) {
            return false;
        }

        if (Math.abs(first.length() - second.length()) > 1) {
            return false;
        }

        String str1;
        String str2;
        if (first.length() <= second.length()) {
            str1 = first;
            str2 = second;
        } else {
            str1 = second;
            str2 = first;
        }

        int i = 0;
        int j = 0;
        boolean foundDifference = false;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;

                if (str1.length() == str2.length()) {
                    i++;
                }
            } else {
                i++;
            }

            j++;
        }

        return true;
    }

    private static boolean oneEditReplace(String first, String second) {
        boolean foundDifference = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundDifference) {
                    return false;
                }

                foundDifference = true;
            }
        }

        return true;
    }

    private static boolean oneEditInsert(String shorter, String longer) {
        int i = 0;
        int j = 0;

        while (i < shorter.length() && j < longer.length()) {
            if (shorter.charAt(i) != longer.charAt(j)) {
                if (i != j) {
                    return false;
                }

                j++;
            } else {
                i++;
                j++;
            }
        }

        return true;
    }
}
