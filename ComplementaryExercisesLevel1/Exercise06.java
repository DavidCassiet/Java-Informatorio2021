import java.util.Scanner;

public class Exercise06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int power = 1;

        for (int i = 1; i <= num2; i++) {
            power *= num1;
        }
        System.out.println(num1 + " raised to the " + num2 + " = " + power);
    }

}
