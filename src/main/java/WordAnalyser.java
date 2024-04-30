import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class WordAnalyser {
    public String[] findLongestWords(String text) {
        // TODO: Implement the logic to find the longest word(s) in the given text

        String[] inputToArray = text
                .replaceAll("[^a-zA-Z0-9 ]*", "")
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
        Map<Character, Integer> mapList = new HashMap<>();
        Map<Character, Integer> result = new HashMap<>();
        String newText = text.replaceAll(" ", "");
        char[] character = newText.toCharArray();
        for (Character c : character){
            if(mapList.get(c) == null){
                mapList.put(c,1);
            } else {
                int value = mapList.get(c);
                value ++;
                mapList.put(c,value);
            }
        }
        Map.Entry<Character, Integer> maxEntry = null;
        for (Map.Entry<Character, Integer> entry : mapList.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        result.put(maxEntry.getKey(), maxEntry.getValue());
        return result;
    }
}