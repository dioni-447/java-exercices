class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder builder = new StringBuilder();
        char[] asArray = identifier.toCharArray();

        for (int i = 0; i < asArray.length; i++) {
            if (Character.isWhitespace(asArray[i])) {
                asArray[i] = '_';
            }

            if (asArray[i] == '-' && i + 1 < asArray.length) {
                asArray[i + 1] = Character.toUpperCase(asArray[i + 1]);
                continue;
            }

            if (asArray[i] == '0') asArray[i] = 'o';
            if (asArray[i] == '1') asArray[i] = 'l';
            if (asArray[i] == '3') asArray[i] = 'e';
            if (asArray[i] == '4') asArray[i] = 'a';
            if (asArray[i] == '7') asArray[i] = 't';

            if (Character.isLetter(asArray[i]) || asArray[i] == '_') {
                builder.append(asArray[i]);
            }
        }

        return builder.toString();
    }
}