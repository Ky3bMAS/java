package work5;

public class Square extends Rectangle {

    public Square() {
        super.setWidth(1);
        super.setLength(1);
    }
    public Square(double side) {
        super(side, side);
    }
    public Square(double side, String color, boolean filled){ super(side, side, color, filled); }
    public Square(Point center, double side, String color, boolean filled){ super(center, side, side, color, filled); }

    @Override
    public void setWidth(double a) {
        super.setWidth(a);
        super.setLength(a);
    }

    @Override
    public void setLength(double b) {
        super.setWidth(b);
        super.setLength(b);
    }

    public void setSide(double side){
        setLength(side);
    }

    public double getSide(){
        return getLength();
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + getWidth() +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                ", perimetr=" + getPerimetr() + ", area=" + getArea() + '}';
    }
}
