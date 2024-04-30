import java.util.ArrayList;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text

        String[] inputToArray = text
                .replaceAll("/[^a-zA-Z0-9 ]*/g", "")
                .split(" ");

        ArrayList<String> stringList = new ArrayList<>();
        int longestLength = inputToArray[0].length();

        for (int n = 1; n < inputToArray.length; n++ ) {
            if (inputToArray[n].length() > longestLength) {
                longestLength = inputToArray[n].length();
            }
        }
        for (String word : inputToArray) {
            if (word.length() == longestLength) {
                stringList.add(word);
            }
        }

        return stringList.toArray(new String[0]);
    }

    public Map<Character, Integer> calculateLetterFrequency(String text) {
        // TODO: Implement the logic to calculate the frequency of each letter in the given text
        return null;
    }
}