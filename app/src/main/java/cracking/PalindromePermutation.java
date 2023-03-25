package cracking;

public class PalindromePermutation {
    public static boolean is(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return false;
        }

        int oddCount = 0;
        var letters = new int[26];

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if ('a' <= ch && ch <= 'Z') {
                int index = Character.toLowerCase(ch) - 'a';

                letters[index]++;

                if (letters[index] % 2 == 1) {
                    oddCount++;
                } else {
                    oddCount--;
                }
            }
        }

        return oddCount <= 1;
    }

    public static boolean is2(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return false;
        }

        int bitVector = CreateBitVector(phrase);
        return bitVector == 0 || CheckExactlyOneBitSet(bitVector);
    }

    private static int CreateBitVector(String phrase) {
        int bitVector = 0;

        for (int i = 0; i < phrase.length(); i++) {
            char ch = phrase.charAt(i);
            if ('a' <= ch && ch <= 'Z') {
                int index = Character.toLowerCase(ch) - 'a';
                bitVector = Toggle(bitVector, index);
            }
        }

        return bitVector;
    }

    private static int Toggle(int bitVector, int index) {
        int mask = 1 << index;

        if ((bitVector & mask) == 0) {
            bitVector |= mask;
        } else {
            bitVector &= ~mask;
        }

        return bitVector;
    }

    private static boolean CheckExactlyOneBitSet(int bitVector) {
        return (bitVector & (bitVector - 1)) == 0;
    }
}
