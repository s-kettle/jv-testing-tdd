import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulatorTest {

    StringManipulator sm = new StringManipulator();

    @Test
    @DisplayName("correctly reverses a given string")
    void reverseString() {
            assertEquals("olleh", sm.reverseString("hello"));
            assertEquals("4321", sm.reverseString("1234"));
    }

    @Test
    @DisplayName("correctly identifies a palindrome")
    void isPalindrome() {
        assertTrue(sm.isPalindrome("rotor"));
        assertFalse(sm.isPalindrome("northcoders"));
    }
}