import org.junit.jupiter.api.Test;
import stream.exercice.DistinctSorted;

import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;

class DistinctSortedTest {

  @Test
  void shouldReturnSortedDistinctNumbers_whenListHasDuplicates() {
    List<Integer> input = Arrays.asList(5, 3, 8, 3, 1, 5, 2);
    List<Integer> result = DistinctSorted.distinctSorted(input);

    assertEquals(List.of(1, 2, 3, 5, 8), result);
  }

  @Test
  void shouldReturnEmptyList_whenInputIsEmpty() {
    List<Integer> input = Collections.emptyList();
    List<Integer> result = DistinctSorted.distinctSorted(input);

    assertEquals(List.of(), result);
  }

  @Test
  void shouldReturnSameList_whenAllElementsAreUniqueAndSorted() {
    List<Integer> input = List.of(1, 2, 3, 4, 5);
    List<Integer> result = DistinctSorted.distinctSorted(input);

    assertEquals(List.of(1, 2, 3, 4, 5), result);
  }

  @Test
  void shouldReturnSortedList_whenElementsAreUnsortedAndDuplicated() {
    List<Integer> input = List.of(10, 3, 2, 10, 3, 1);
    List<Integer> result = DistinctSorted.distinctSorted(input);

    assertEquals(List.of(1, 2, 3, 10), result);
  }

  @Test
  void shouldHandleNegativeNumbersCorrectly() {
    List<Integer> input = List.of(-5, -2, 0, -2, 4, -5);
    List<Integer> result = DistinctSorted.distinctSorted(input);

    assertEquals(List.of(-5, -2, 0, 4), result);
  }
}