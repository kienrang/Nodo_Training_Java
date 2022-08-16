import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new Hashtable<Integer, String>();
        map.put(3, "Kien");
        map.put(2, "Het");
        map.put(1, "Tien");
        System.out.println(map.get(3));

        map.put(3, "Roi");
        System.out.println(map.get(3));

        MapExample1();
    }

    public static void MapExample1() {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(3, "Kien");
        map.put(2, "Het");
        map.put(1, "Tien");

        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        map.descendingKeySet().forEach(key -> {
            System.out.println("Key: " + key + " value: " + map.get(key));
        });
    }
}
