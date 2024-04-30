import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordAnalyserTest {

    @Test
    @DisplayName("Find the longest word in the text")
    void findLongestWords() {
        assertEquals("established", WordAnalyser.findLongestWords("It is a long established fact that a reader will be distracted by the readable content"));
        assertEquals("variations", "There are many variations of passages of Lorem Ipsum available");
    }

//    @Test
//    @DisplayName("calculate the frequency of each letter")
//    void calculateLetterFrequency() {
//        assertA
//        assertEquals(, WordAnalyser.calculateLetterFrequency("this a a this by by apple or"));
//        assertEquals("", WordAnalyser.calculateLetterFrequency());
//     }
}
