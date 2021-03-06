import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);

        List<Integer> numbersStream = numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
        System.out.println(numbersStream);
    }
}