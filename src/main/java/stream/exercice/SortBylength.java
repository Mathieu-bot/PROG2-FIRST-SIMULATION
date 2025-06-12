package stream.exercice;

import java.util.List;

public class SortBylength {
    static List<String> sortByLength(List<String> words){
        return words.stream()
                .sorted((a,b) -> a.length() - b.length())
                .toList();
    }
}