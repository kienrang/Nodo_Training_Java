import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectionOperation {
    public static void main(String[] args) {
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(4, 5, 6, 8, 9, 2, 3));
        Comparator<Integer> comparator = Integer::compare;
        Collections.sort(listOfIntegers, comparator);

        listOfIntegers.stream().filter(v -> v > 5).forEach(v -> {
            System.out.println(v);
        });
    }
}
