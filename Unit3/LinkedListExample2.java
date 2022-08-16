import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // String[] mang = { "Kiên", "Hết", "Tiền" };
        List<String> list = new LinkedList<>(Arrays.asList(args));
        list.forEach(v -> {
            System.out.println(v);
        });
    }
}
