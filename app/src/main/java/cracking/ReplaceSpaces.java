package cracking;

public class ReplaceSpaces {
    public static void replace(char[] str, int trueLength) {
        if (str == null || trueLength <= 0) {
            return;
        }

        int spaceCount = 0;
        for (int i = 0; i < trueLength; i++) {
            if (str[i] == ' ') {
                spaceCount++;
            }
        }

        var index = trueLength + spaceCount * 2;
        if (trueLength < str.length) {
            str[trueLength] = '\0';
        }

        for (var i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
