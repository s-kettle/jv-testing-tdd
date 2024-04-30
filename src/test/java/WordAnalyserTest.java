import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    WordAnalyser analyser = new WordAnalyser();

    @Test
    @DisplayName("Find the longest word in the text")
    void findLongestWords() {
        String[] expectedArray1 = {"sentence"};
        String[] actualArray1 = analyser.findLongestWords("This is a fairly boring sentence");
        assertArrayEquals(expectedArray1, actualArray1);

        String[] expectedArray2 = {"fairly", "boring"};
        String[] actualArray2 = analyser.findLongestWords("This is a fairly boring thing.");
        assertArrayEquals(expectedArray2, actualArray2);
    }

    @Test
    @DisplayName("calculate the frequency of each letter")
    void calculateLetterFrequency() {
        Map<Character, Integer> expectedMap1 = new HashMap<>() {{put('l', 3); }};
        Map<Character, Integer> actualMap1 = analyser.calculateLetterFrequency("Hello world");
        Map<Character, Integer> expectedMap2 = new HashMap<>() {{put('a', 4); }};
        Map<Character, Integer> actualMap2 = analyser.calculateLetterFrequency("Waka waka, eh eh");
        Map<Character, Integer> expectedMap3 = new HashMap<>() {{put('y', 6); }};
        Map<Character, Integer> actualMap3 = analyser.calculateLetterFrequency("Say, say, say, hey, hey now baby");

        assertEquals(expectedMap1, actualMap1);
        assertEquals(expectedMap2, actualMap2);
        assertEquals(expectedMap3, actualMap3);


    }
}
