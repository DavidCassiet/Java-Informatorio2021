import java.util.Scanner;

public class Exercise05 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        scan.close();
        int sum = 0;

        for (int i = 1; i <= num2; i++) {
            sum += num1;
        }
        System.out.println(num1 + " * " + num2 + " = " + sum);
    }
}
