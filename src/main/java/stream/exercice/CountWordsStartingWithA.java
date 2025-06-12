package stream.exercice;
import java.util.List;

public class CountWordsStartingWithA {
  public static long countWordsStartWithA (List<String> str) {
    return str.stream().filter(e -> e.startsWith("A")).count();
  }
}
