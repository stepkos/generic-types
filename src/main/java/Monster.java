import java.lang.reflect.Array;
import java.util.HashMap;

public abstract class Monster implements Moving, Fight {

    private double coordinateX = 0.0d;
    private double coordinateY = 0.0d;

    public Monster() {}
    public Monster(double coordinateX, double coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    public double countDistance(Monster obj) {
        double x = Math.pow(obj.coordinateX - this.coordinateX, 2);
        double y = Math.pow(obj.coordinateY - this.coordinateY, 2);
        return Math.sqrt(x + y);
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    @Override
    public void goUp(Number value) {
        coordinateY += value.doubleValue();
    }

    @Override
    public void goDown(Number value) {
        coordinateY -= value.doubleValue();
    }

    @Override
    public void goLeft(Number value) {
        coordinateX -= value.doubleValue();
    }

    @Override
    public void goRight(Number value) {
        coordinateX += value.doubleValue();
    }
}
