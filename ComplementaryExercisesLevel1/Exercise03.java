import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();

        for (int i = 1; i <= num; i++) {
            for (int x = 1; x <= i; x++) {
                System.out.print(x + " ");
            }
            System.out.println(" ");
        }
    }
}
