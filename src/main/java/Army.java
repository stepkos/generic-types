import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.function.Function;

public class Army <T extends Monster> {
    private int quantity = 0;
    private ArrayList<T> members = new ArrayList<>();

    public void add(T member) {
        members.add((member));
        quantity++;
    }

    public void commandArmy(Function<Monster, Monster> fun) {
//        for (int i = 0; i < members.size(); i++) {
//            members.
//        }

//        for (Monster member : members) {
//            member = fun.apply(member);
//        }
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        String ts = "Army members positions: " ;
        for (T member : members) {
            ts = ts.concat("(x: " + member.getCoordinateX() + " y: " + member.getCoordinateY() + " ), ");
        }
        return ts;
    }
}
