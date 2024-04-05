import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MarsRoverTests {

    @Test
    public void testMoveForwardWest() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.WEST);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Coordinates2D(2, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveForwardWestCapitalLetter() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.WEST);

        //Act
        rover.move("F");

        //Assert
        Assertions.assertEquals(new Coordinates2D(2, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveBackWest() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.WEST);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Coordinates2D(4, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveBackWestCapitalLetter() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.WEST);

        //Act
        rover.move("B");

        //Assert
        Assertions.assertEquals(new Coordinates2D(4, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveForwardEast() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.EAST);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Coordinates2D(4, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveBackEast() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.EAST);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Coordinates2D(2, 3), rover.getCurrentLocation());
    }

    @Test
    public void testMoveForwardNorth() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.NORTH);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Coordinates2D(3, 2), rover.getCurrentLocation());
    }

    @Test
    public void testMoveBackNorth() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.NORTH);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Coordinates2D(3, 4), rover.getCurrentLocation());
    }

    @Test
    public void testMoveForwardSouth() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.SOUTH);

        //Act
        rover.move("f");

        //Assert
        Assertions.assertEquals(new Coordinates2D(3, 4), rover.getCurrentLocation());
    }

    @Test
    public void testMoveBackSouth() {

        //Arrange (see README for reference to Arrange-Act-Assert Pattern)
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3, 3), Direction.SOUTH);

        //Act
        rover.move("b");

        //Assert
        Assertions.assertEquals(new Coordinates2D(3, 2), rover.getCurrentLocation());
    }

    @Test
    public void testTurnRightWest(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("r");

        //Assert
        Assertions.assertEquals(Direction.NORTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnRightWestCapitalLetter(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("R");

        //Assert
        Assertions.assertEquals(Direction.NORTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnLeftWest(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("l");

        //Assert
        Assertions.assertEquals(Direction.SOUTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnLeftWestCapitalLetter(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("L");

        //Assert
        Assertions.assertEquals(Direction.SOUTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnRightEast(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.EAST);

        //Act
        rover.move("r");

        //Assert
        Assertions.assertEquals(Direction.SOUTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnLeftEast(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.EAST);

        //Act
        rover.move("l");

        //Assert
        Assertions.assertEquals(Direction.NORTH, rover.getCurrentDirection());
    }

    @Test
    public void testTurnRightNorth(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.NORTH);

        //Act
        rover.move("r");

        //Assert
        Assertions.assertEquals(Direction.EAST, rover.getCurrentDirection());
    }

    @Test
    public void testTurnLeftNorth(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.NORTH);

        //Act
        rover.move("l");

        //Assert
        Assertions.assertEquals(Direction.WEST, rover.getCurrentDirection());
    }

    @Test
    public void testTurnRightSouth(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.SOUTH);

        //Act
        rover.move("r");

        //Assert
        Assertions.assertEquals(Direction.WEST, rover.getCurrentDirection());
    }

    @Test
    public void testTurnLeftSouth(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.SOUTH);

        //Act
        rover.move("l");

        //Assert
        Assertions.assertEquals(Direction.EAST, rover.getCurrentDirection());
    }

    @Test
    public void testMultipleCommandsAssertPosition(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("FFRBLB");

        //Assert
        Assertions.assertEquals(new Coordinates2D(2,4), rover.getCurrentLocation());
    }

    @Test
    public void testMultipleCommandsAssertDirection(){

        //Arrange
        MarsRover rover = new MarsRoverImpl(new Coordinates2D(3,3),Direction.WEST);

        //Act
        rover.move("FFRBLB");

        //Assert
        Assertions.assertEquals(Direction.WEST, rover.getCurrentDirection());
    }
}
