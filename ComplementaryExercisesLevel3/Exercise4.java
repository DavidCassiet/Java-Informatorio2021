import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise4 {
    public static void main(String[] args) {
        
        List<Integer> numbers = new ArrayList<>();
            numbers.add(1);
            numbers.add(2);
            numbers.add(4);
            numbers.add(4);
            numbers.add(4);

        // HashSet<Integer> numbersSet = new HashSet<>(numbers);
        // System.out.println(numbersSet);
        Integer count = 0;

        List<Integer> numbersStream = numbers.stream()
                
                .filter(number -> (numbers.contains(number)))

                .collect(Collectors.toList());
                for(Integer number : numbersStream){
                    factorial(number);
                }       
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
