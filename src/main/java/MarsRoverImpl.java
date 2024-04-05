public class MarsRoverImpl implements MarsRover {

    private int x;
    private int y;
    private Direction direction;

    public MarsRoverImpl(Coordinates2D startingPosition, Direction startingDirection){
        x = startingPosition.x();
        y = startingPosition.y();
        direction = startingDirection;
    }

    @Override
    public void move(String commands){
        if(commands.equalsIgnoreCase("f")){
            switch (direction){
                case EAST -> x++;
                case SOUTH -> y++;
                case WEST -> x--;
                case NORTH -> y--;
            }
        } else if (commands.equalsIgnoreCase("b")) {
            switch (direction){
                case EAST -> x--;
                case SOUTH -> y--;
                case WEST -> x++;
                case NORTH -> y++;
            }
        } else if (commands.equalsIgnoreCase("r")) {
            switch (direction){
                case EAST -> direction=Direction.SOUTH;
                case SOUTH -> direction=Direction.WEST;
                case WEST -> direction=Direction.NORTH;
                case NORTH -> direction=Direction.EAST;
            }
        } else if (commands.equalsIgnoreCase("l")) {
            switch (direction){
                case EAST -> direction=Direction.NORTH;
                case SOUTH -> direction=Direction.EAST;
                case WEST -> direction=Direction.SOUTH;
                case NORTH -> direction=Direction.WEST;
            }
        }
    }

    @Override
    public Coordinates2D getCurrentLocation() {
        return new Coordinates2D(x, y);
    }

    @Override
    public Direction getCurrentDirection(){
        return direction;
    }
}
