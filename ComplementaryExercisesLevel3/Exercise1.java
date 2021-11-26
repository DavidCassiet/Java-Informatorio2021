import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
            words.add("Hello");
            words.add(null);
            words.add("Informatorio");
            words.add("");
            words.add("   ");
            words.add(" 2021 ");

        List<String> wordsStream = words.stream()
                .filter(word -> Objects.nonNull(word) && !word.isBlank())
                .map(String :: trim)
                .collect(Collectors.toList());
        System.out.println(wordsStream);
    }
}