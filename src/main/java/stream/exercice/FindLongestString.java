package stream.exercice;

import java.util.List;
import java.util.Optional;

public class FindLongestString {
  public static Optional<String> findLongestString(List<String> strings) {
    return strings.stream()
                  .reduce("", (a, v) -> v.length() > a.length() ? a = v : a)
                  .describeConstable();
  }
}
