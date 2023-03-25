package cracking;

public class Compression {
    public static String compress(String str) {
        if (str == null || str.equals("")) {
            return str;
        }

        int finalLength = countCompress(str);
        if (finalLength >= str.length()) {
            return str;
        }

        int consecutiveCount = 0;
        var compressed = new StringBuilder(finalLength);

        for (int i = 0; i < str.length(); i++) {
            consecutiveCount++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressed.append(str.charAt(i));
                compressed.append(consecutiveCount);

                consecutiveCount = 0;
            }
        }

        return compressed.toString();
    }

    private static int countCompress(String str) {
        int compressedLength = 0;
        int consecutiveCount = 0;

        for (int i = 0; i < str.length(); i++) {
            consecutiveCount++;

            if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
                compressedLength += 1 + Integer.toString(consecutiveCount).length();
                consecutiveCount = 0;
            }
        }

        return compressedLength;
    }
}
