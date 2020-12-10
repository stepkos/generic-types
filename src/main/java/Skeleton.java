public class Skeleton extends Monster {

    public Skeleton() {}
    public Skeleton(double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
    }

    @Override
    public void basicAttack(Number value) {
        System.out.println("I' am Skeleton. I' am hitting!");
    }

    @Override
    public void specialAttack(Number value) {
        System.out.println("I' am Skeleton. I' am shooting a bow!");
    }
}
