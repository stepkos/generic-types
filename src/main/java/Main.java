import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        ArrayList<Monster> monsters = new ArrayList<>(
                Arrays.asList(
                    new Zombie(2, 5),
                    new Skeleton(5, 5),
                    new Zombie(4, 1)
                )
        );

        monsters.forEach(e -> e.specialAttack(5));



//        Skeleton s1 = new Skeleton(-1, 2);
//        Zombie s2 = new Zombie(2, 6);
//        System.out.println(s1.countDistance(s2));

//        Monster m1 = new Skeleton();
//        m1.specialAttack(10);
//
        Army<Skeleton> army1 = new Army<>();
        army1.add(new Skeleton(2, 5));
        army1.add(new Skeleton(6, 1));
        System.out.println(army1);

//        army1.commandArmy((Monster m) -> new Skeleton(5, 2));
//        System.out.println(army1);

    }
}
