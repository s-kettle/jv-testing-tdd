public class Compass {

    public enum Point {
        NORTH,
        SOUTH,
        EAST,
        WEST
    }

    public enum Direction {
        LEFT,
        RIGHT
    }

    private Point point;

    public static Point rotate(Point point, Direction direction){
        return Point.EAST;
    }
}
