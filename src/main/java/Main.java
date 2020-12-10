public class Main {
    public static void main(String[] args) {

//        Skeleton s1 = new Skeleton(-1, 2);
//        Zombie s2 = new Zombie(2, 6);
//        System.out.println(s1.countDistance(s2));

//        Monster m1 = new Skeleton();
//        m1.specialAttack(10);

        Army<Skeleton> army1 = new Army<>();
        army1.add(new Skeleton(2, 5));
        army1.add(new Skeleton(6, 1));
        System.out.println(army1);

//        army1.commandArmy((Monster m) -> new Skeleton(5, 2));
//        System.out.println(army1);

    }
}
