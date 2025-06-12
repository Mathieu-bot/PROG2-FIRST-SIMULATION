package stream.exercice;

import java.util.List;

public class StringMaj {
  public static List<String> toUpperCase(List<String> words) {
    return words.stream().map(String::toUpperCase).toList();
  }
}
