package stream.exercice;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctSorted {
    public static List<Integer> distinctSorted(List<Integer> numbers) {
        return numbers.stream().distinct().sorted().collect(Collectors.toList());
    }
}
