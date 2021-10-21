import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: "); int num = scanner.nextInt(); scanner.close();

        for (int i = 1; i <= num; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}