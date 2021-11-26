import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
            words.add("Batman");
            words.add("Aquaman");
            words.add("Flash");
            words.add("Batgirl");
            words.add("Wonder Woman");
            words.add("brainiac");

        List<String> wordsStream = words.stream()
                .filter(word -> word.startsWith("b") || word.startsWith("B"))
                .collect(Collectors.toList());
        System.out.println(wordsStream);
    }
}