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
        }
    }

    @Override
    public Coordinates2D getCurrentLocation() {
        return new Coordinates2D(x, y);
    }
}
