import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("correctly rotates a compass point in a specified direction")
    void rotate() {
        assertEquals(Compass.Point.EAST, Compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT));
    }
}