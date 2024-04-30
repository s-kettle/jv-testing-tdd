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
        switch(point) {
            case NORTH -> {
                if (direction.equals(Direction.LEFT)) {
                    return Point.WEST;
                } else {
                    return Point.EAST;
                }
            }
            case EAST -> {
                if (direction.equals(Direction.LEFT)) {
                    return Point.NORTH;
                } else {
                    return Point.SOUTH;
                }
            }
            case SOUTH -> {
                if (direction.equals(Direction.LEFT)) {
                    return Point.EAST;
                } else {
                    return Point.WEST;
                }
            }
            case WEST -> {
                if (direction.equals(Direction.LEFT)) {
                    return Point.SOUTH;
                } else {
                    return Point.NORTH;
                }
            }
        }
        return null;
    }
}
