package turle;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static turle.Direction.*;

public class TurtleTest {
    Turtle ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle();
    }


    @Test
    public void thereIsATurtle() {
        Turtle ijapa = new Turtle();
        assertNotNull(ijapa);

    }
    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
        }

    @Test
    public void turtleCanMovePenDownTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());


        ijapa.penDown();
        assertFalse(ijapa.isPenDown());
         }


    @Test
    public void turtleCanTurnRight_whileFacingEastTest() {
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST,ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
        ijapa.turnRight();
        assertEquals(SOUTH,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST,ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH,ijapa.getCurrentDirection());

    }


    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        assertEquals(EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH,ijapa.getCurrentDirection());


    }
    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest(){
        assertEquals(EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST,ijapa.getCurrentDirection());

    }
    @Test
    public void turtleCanTurnLeft_whileFacingWestTest(){
        assertEquals(EAST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST,ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH,ijapa.getCurrentDirection());

    }

    @Test
    public void turtleCanMoveWhileFacingEastTest(){
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.move(3);
        assertEquals(new Position(0, 3), ijapa.getCurrentPosition());
    }
}

