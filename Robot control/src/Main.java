class Move {
    public static void moveRobot(Robot robot, int toX, int toY) {
        //robot.stepForward(); // your implementation here

        // x
        if (robot.getX() < toX) {
            switch (robot.getDirection().name()) {
                case "RIGHT":
                    break;
                case "LEFT":
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case "UP":
                    robot.turnRight();
                    break;
                case "DOWN":
                    robot.turnLeft();
                    break;
                default:
                    throw new IllegalStateException();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        } else if (robot.getX() > toX) {
            switch (robot.getDirection().name()) {
                case "RIGHT":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case "LEFT":
                    break;
                case "UP":
                    robot.turnLeft();
                    break;
                case "DOWN":
                    robot.turnRight();
                    break;
                default:
                    throw new IllegalStateException();
            }
            while (robot.getX() != toX) {
                robot.stepForward();
            }
        }

        //y
        if (robot.getY() < toY){
            switch (robot.getDirection().name()){
                case "UP":
                    break;
                case "DOWN":
                    robot.turnLeft();
                    robot.turnLeft();
                    break;
                case "RIGHT":
                    robot.turnLeft();
                    break;
                case "LEFT":
                    robot.turnRight();
                    break;
                default:
                    throw new IllegalStateException();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        } else if (robot.getY() > toY){
            switch (robot.getDirection().name()){
                case "UP":
                    robot.turnRight();
                    robot.turnRight();
                    break;
                case "DOWN":
                    break;
                case "RIGHT":
                    robot.turnRight();
                    break;
                case "LEFT":
                    robot.turnLeft();
                    break;
                default:
                    throw new IllegalStateException();
            }
            while (robot.getY() != toY) {
                robot.stepForward();
            }
        }

        /*if (toX > robot.getX()) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getX() < toX) {
                robot.stepForward();
            }
        } else if (toX < robot.getX()) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnRight();
            }
            while (robot.getX() > toX) {
                robot.stepForward();
            }
        }
        //set correct Y
        if (toY > robot.getY()) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (toY > robot.getY()) {
                robot.stepForward();
            }
        } else if (toY < robot.getY()) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnRight();
            }
            while (toY < robot.getY()) {
                robot.stepForward();
            }
        }
        */
    }
}

//Don't change code below

enum Direction {
    UP(0, 1),
    DOWN(0, -1),
    LEFT(-1, 0),
    RIGHT(1, 0);

    private final int dx;
    private final int dy;

    Direction(int dx, int dy) {
        this.dx = dx;
        this.dy = dy;
    }

    public Direction turnLeft() {
        switch (this) {
            case UP:
                return LEFT;
            case DOWN:
                return RIGHT;
            case LEFT:
                return DOWN;
            case RIGHT:
                return UP;
            default:
                throw new IllegalStateException();
        }
    }

    public Direction turnRight() {
        switch (this) {
            case UP:
                return RIGHT;
            case DOWN:
                return LEFT;
            case LEFT:
                return UP;
            case RIGHT:
                return DOWN;
            default:
                throw new IllegalStateException();
        }
    }

    public int dx() {
        return dx;
    }

    public int dy() {
        return dy;
    }
}

class Robot {
    private int x;
    private int y;
    private Direction direction;

    public Robot(int x, int y, Direction direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void turnLeft() {
        direction = direction.turnLeft();
    }

    public void turnRight() {
        direction = direction.turnRight();
    }

    public void stepForward() {
        x += direction.dx();
        y += direction.dy();
    }

    public Direction getDirection() {
        return direction;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

/*public class Main {

    public static void main(String[] args) {
        // Robot starting position and direction
        Robot robot = new Robot(0, 0, Direction.UP);
        System.out.println(robot.getX() + " " + robot.getY());

        // Target position
        Move.moveRobot(robot, -3, 0);

        robot.turnLeft();
        robot.turnLeft();
        robot.stepForward();
        robot.stepForward();
        robot.stepForward();

        // Robot new position after executing move function
        System.out.println(robot.getX() + " " + robot.getY());
    }
}*/