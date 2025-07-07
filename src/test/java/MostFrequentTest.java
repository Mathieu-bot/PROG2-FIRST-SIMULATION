import org.junit.jupiter.api.Test;
import stream.exercice.MostFrequent;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MostFrequentTest {

  @Test
  void shouldReturnMostFrequentWord_whenListHasMultipleWords() {
    List<String> words = Arrays.asList("chat", "chien", "chat", "oiseau", "chien", "chat");
    Optional<String> result = MostFrequent.mostFrequent(words);

    assertTrue(result.isPresent());
    assertEquals("chat", result.get());
  }

  @Test
  void shouldReturnEmpty_whenListIsEmpty() {
    List<String> words = Collections.emptyList();
    Optional<String> result = MostFrequent.mostFrequent(words);

    assertFalse(result.isPresent());
  }

  @Test
  void shouldReturnOneOfTheMostFrequent_whenThereIsATie() {
    List<String> words = Arrays.asList("chat", "chien", "chat", "chien");
    Optional<String> result = MostFrequent.mostFrequent(words);

    assertTrue(result.isPresent());
    assertTrue(result.get().equals("chat") || result.get().equals("chien"));
  }

  @Test
  void shouldReturnTheOnlyWord_whenListHasOneElement() {
    List<String> words = List.of("unique");
    Optional<String> result = MostFrequent.mostFrequent(words);

    assertTrue(result.isPresent());
    assertEquals("unique", result.get());
  }
}
