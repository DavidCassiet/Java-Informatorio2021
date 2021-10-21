import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base number: "); int num1 = scanner.nextInt();
        System.out.print("Enter exponent number: "); int num2 = scanner.nextInt(); scanner.close();
        int power = 1;

        for (int i = 1; i <= num2; i++) {
            power *= num1;
        }
        System.out.println(num1 + " raised to the " + num2 + " = " + power);
    }
}