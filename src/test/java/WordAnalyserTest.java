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

        assertEquals(expectedMap1, actualMap1);

    }
}
