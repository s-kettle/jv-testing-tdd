import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CompassTest {

    @Test
    @DisplayName("correctly rotates a compass point in a specified direction")
    void rotate() {
        //assertEquals(Compass.Point.EAST, Compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT));
        assertAll(() -> assertEquals(Compass.Point.EAST, Compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT)),
                () -> assertEquals(Compass.Point.SOUTH, Compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT)),
                () ->assertEquals(Compass.Point.WEST, Compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT)),
                () ->assertEquals(Compass.Point.NORTH, Compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT)),
                () ->assertEquals(Compass.Point.WEST, Compass.rotate(Compass.Point.NORTH, Compass.Direction.LEFT)),
                () ->assertEquals(Compass.Point.NORTH, Compass.rotate(Compass.Point.EAST, Compass.Direction.LEFT)),
                () ->assertEquals(Compass.Point.EAST, Compass.rotate(Compass.Point.SOUTH, Compass.Direction.LEFT)),
                () ->assertEquals(Compass.Point.SOUTH, Compass.rotate(Compass.Point.WEST, Compass.Direction.LEFT))
        );
    }
}