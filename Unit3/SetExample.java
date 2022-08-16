import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>();
        num.add(1);
        num.add(14);
        num.add(8);
        num.add(4);
        num.add(2);

        System.out.println("Size of set" + num.size());
    }
}
