package turle;

import static turle.Direction.*;
public class Turtle {

    private boolean isPenUp;
    private Position currentPosition = new Position(0,0);

    public void penUp() {
        isPenUp = true;
    }

    public Direction currentDirection = EAST;

    public boolean isPenUp() {
        return isPenUp;
    }

        public void PenDown() {
        isPenUp= false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if(currentDirection == WEST) face(NORTH);
        if(currentDirection == SOUTH) face(WEST);
        if(currentDirection == EAST)  face(SOUTH);
    }

    private void face(Direction newDirection) {
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if(currentDirection == WEST)  face(SOUTH);
        if(currentDirection == NORTH)  face(WEST);
        if(currentDirection == EAST)  face(NORTH);
    }

    public boolean isPenDown() {
        return isPenUp;

    }

    public void penDown() {
        isPenUp = false;

    }

    public Position getCurrentPosition(){
        return currentPosition;
    }

    public void move(int noOfSteps) {
        if(currentDirection == EAST){
            int newColumn = currentPosition.getColumn () + noOfSteps;
            currentPosition.setColumn(newColumn);
        }
    }
}
