import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name and last name: ");
        String nameLastName = scanner.nextLine();
        System.out.print("Age: ");
        String age = scanner.nextLine();
        System.out.print("Direction: ");
        String direction = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        scanner.close();
        System.out.println(city + " - " + direction + " - " + age + " - " + nameLastName);
    }
}