package stream.exercice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequent {
  public static Optional<String> mostFrequent(List<String> words) {
    Map<String, Long> map = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    return map.entrySet()
      .stream()
      .max(Map.Entry.comparingByValue())
      .map(Map.Entry::getKey);
  }

//  public static Optional<String> mostFrequentLetter(List<String> words) {
//    return words.stream()
//      .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
//      .entrySet()
//      .stream()
//      .max(Comparator.comparing(Map.Entry::getValue))
//      .map(Map.Entry::getKey);
//  }

  public static void main(String[] args) {
    List<String> words = List.of("cat", "cats", "cat", "cats", "dogs", "dogs", "dogs");
    System.out.println(mostFrequent(words));
  }
}
