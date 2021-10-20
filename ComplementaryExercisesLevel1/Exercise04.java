import java.util.Scanner;

public class Exercise04 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for factorial: ");
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("The factorial of " + number + " is: " + factorial(number));
    }

    public static Integer factorial(Integer number) { 
        if(number == 1) {
            return number;
        } else { 
            return (number * factorial(number -1));
        }
    }
}