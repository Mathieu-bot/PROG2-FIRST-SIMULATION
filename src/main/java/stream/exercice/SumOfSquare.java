package stream.exercice;

import java.util.List;

public class SumOfSquare {
  public static int sumOfSquares(List<Integer> numbers) {
    return numbers.stream().mapToInt(x -> x * x).sum();
  }
}
