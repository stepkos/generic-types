public class Zombie extends Monster {

    public Zombie() {}
    public Zombie(double coordinateX, double coordinateY) {
        super(coordinateX, coordinateY);
    }

    @Override
    public void basicAttack(Number value) {
        System.out.println("I' am Zombie. I' am hitting!");
    }

    @Override
    public void specialAttack(Number value) {
        System.out.println("I' am Zombie. I' am biting!");
    }
}
