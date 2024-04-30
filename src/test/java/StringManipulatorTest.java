import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    @Test
    @DisplayName("correctly reverses a given string")
    void reverseString() {
            assertEquals("olleh", StringManipulator.reverseString("hello"));
            assertEquals("4321", StringManipulator.reverseString("1234"));
    }

    @Test
    @DisplayName("correctly identifies a palindrome")
    void isPalindrome() {
        assertTrue(StringManipulator.isPalindrome("rotor"));
        assertFalse(StringManipulator.isPalindrome("northcoders"));
    }
}