import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 4, 4, 4);
        List<Integer> numbersStream = numbers.stream()
                .map(p -> Exercise4.factorial(p))
                .distinct()
                .collect(Collectors.toList());
        System.out.println(numbersStream);
    }
    public static Integer factorial(Integer number) { 
        if(number == 1) {
            return number;
        } else { 
            return (number * factorial(number -1));
        }
    }
}
