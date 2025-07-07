package stream.exercice;

import java.util.List;

public class sortBylength{
    static List<String> sortByLength(List<String> words){
        return words.stream()
                    .sorted((a,b) -> a.length() - b.length())
                    .toList();
    }
}