import java.util.*;

public class Exercise07 {

    public static void main(String[] args) {

        System.out.println(fizzBuzzFunction(1, 6)); System.out.println(fizzBuzzFunction(1, 8));
    }

    public static ArrayList<String> fizzBuzzFunction(int comienzo, int fin) {
        ArrayList<String> arrayResult = new ArrayList<String>();
        for( int i = comienzo; i <= fin -1; i++ ) {
            if ((i % 2 == 0 ) && (i % 3 == 0 )) {
                arrayResult.add("FizzBuzz");  
            } else if (i % 2 == 0 ) {
                arrayResult.add("Fizz");
            } else if (i % 3 == 0 ) {
                arrayResult.add("Buzz");  
            } else {
                arrayResult.add(String.valueOf(i));
            }
        }
        return arrayResult;
    } 
}