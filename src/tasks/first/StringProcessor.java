package tasks.first;

import java.util.HashMap;

public class StringProcessor {

    /**
     * Returns the first not repeated character in the input string.
     * <p>
     * A null return indicates that the input string is null, empty or has no
     * non-repeated character.
     *
     * @param inputString the string under processing
     * @return character object contains the value or null
     */
    public static Character findFirstNonRepeatedChar(String inputString) {
        if (inputString == null || inputString.length() == 0) {
            return null;
        }

        //Find the count of each character
        char[] inputChars = inputString.toLowerCase().toCharArray();
        HashMap<Character, Integer> charsCouter = new HashMap(128);
        for (int i = 0; i < inputChars.length; i++) {
            if (charsCouter.containsKey(inputChars[i])) {
                charsCouter.put(inputChars[i], charsCouter.get(inputChars[i]) + 1);
            } else {
                charsCouter.put(inputChars[i], 1);
            }
        }

        //finfd first character has counter of 1
        for (int i = 0; i < inputChars.length; i++) {
            if (charsCouter.get(inputChars[i]) == 1) {
                return inputChars[i];
            }
        }
        return null;
    }
}
