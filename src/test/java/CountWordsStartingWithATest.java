import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import stream.exercice.CountWordsStartingWithA;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class CountWordsStartingWithATest {

  @Test
  @DisplayName("A method who count all string starting with 'A' in a list")
  void countWordsStartWithA() {
    assertEquals(2, CountWordsStartingWithA.countWordsStartWithA(List.of("bonjour", "Au revoir", "see", "you", "Again", "another")));
  }
}
