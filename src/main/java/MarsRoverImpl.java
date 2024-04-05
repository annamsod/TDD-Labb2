public class MarsRoverImpl implements MarsRover {

    private int x;
    private int y;
    private Direction direction;

    public MarsRoverImpl(Coordinates2D startingPosition, Direction startingDirection){
        x = startingPosition.x();
        y = startingPosition.y();
        direction = startingDirection;
    }

    final int maxDegree = 360;

    @Override
    public void move(String input){
        for(char commands : input.toCharArray()) {
            if (commands=='f' || commands=='F') {
                switch (direction) {
                    case EAST -> x++;
                    case SOUTH -> y++;
                    case WEST -> x--;
                    case NORTH -> y--;
                }
            } else if (commands=='b' || commands=='B') {
                switch (direction) {
                    case EAST -> x--;
                    case SOUTH -> y--;
                    case WEST -> x++;
                    case NORTH -> y++;
                }
            } else if (commands=='r' || commands=='R') {
                switch (direction) {
                    case EAST -> direction = Direction.SOUTH;
                    case SOUTH -> direction = Direction.WEST;
                    case WEST -> direction = Direction.NORTH;
                    case NORTH -> direction = Direction.EAST;
                }
            } else if (commands=='l' || commands=='L') {
                switch (direction) {
                    case EAST -> direction = Direction.NORTH;
                    case SOUTH -> direction = Direction.EAST;
                    case WEST -> direction = Direction.SOUTH;
                    case NORTH -> direction = Direction.WEST;
                }
            }


            // Handle movement over zero median
            if(x>maxDegree){
                x=1;
            } else if (x<1) {
                x=maxDegree;
            }

            // Handle movement over the poles
            if(y>maxDegree || y<1){
                y=Math.abs(y-1);
                x=(x+maxDegree/2)%maxDegree;
                if(direction==Direction.NORTH){
                    direction=Direction.SOUTH;
                }
                else{
                    direction=Direction.NORTH;
                }
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
