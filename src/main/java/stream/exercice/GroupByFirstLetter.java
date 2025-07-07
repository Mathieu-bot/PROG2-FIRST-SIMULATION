package stream.exercice;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByFirstLetter {
  public static Map<Character, List<String>> groupByFirstLetter(List<String> words) {
    Map<Character, List<String>> grouped = new HashMap<>();
    for (String word : words) {
      grouped.computeIfAbsent(word.charAt(0), k -> new ArrayList<>()).add(word);
    }
    return grouped;
  }

  public static Map<Character, List<String>> groupByFirstLetter2(List<String> words) {
    return words.stream()
      .collect(Collectors.groupingBy(word -> word.charAt(0)));
  }
}



