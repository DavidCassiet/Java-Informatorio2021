import java.util.Scanner;

public class Exercise01 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        scanner.close();
        System.out.println("Hello " + username);
    }
}