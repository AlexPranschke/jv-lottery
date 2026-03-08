package core.basesyntax;
public class Ball {
    private final String color;
    private final int size;
    public Ball(String color, int size) {
        this.color = color;
        this.size = size;
    }
    public String getColor() {
        return color;
    }
    public int getSize() {
        return size;
    }
     @Override
    public String toString() {
        return "Ball{" + "color='" + getColor() + '\'' + ", size=" + getSize() + '}';
    }
}