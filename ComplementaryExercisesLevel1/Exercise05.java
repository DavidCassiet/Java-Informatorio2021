import java.util.Scanner;

public class Exercise05 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number for successive sums: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number for successive sums: ");
        int num2 = scanner.nextInt();
        scanner.close();
        int sum = 0;

        for (int i = 1; i <= num2; i++) {
            sum += num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + sum);
    }
}