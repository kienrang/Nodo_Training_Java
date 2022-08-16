import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] values = { "Kien", "Het", "Tien" };
        Collections.addAll(list, values);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
        System.out.println("Vị trí: " + Collections.binarySearch(list, "Het"));
    }
}
