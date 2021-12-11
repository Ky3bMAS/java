package work6;

public class MovableRectangle extends Rectangle implements Movable {

    @Override
    public void move(int x, int y) {
        this.setX(getX() + x);
        this.setY(getY() + y);
    }
}
