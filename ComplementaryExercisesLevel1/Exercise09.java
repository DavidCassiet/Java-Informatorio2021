import java.util.Scanner;

public class Exercise09 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: "); String text = scanner.nextLine();
        System.out.print("Enter leter: "); char letter = scanner.next().charAt(0); scanner.close();
        char[] toCharacters = text.toCharArray();
        int count = 0;

        for (char character : toCharacters) {
            if (character == letter) {
                count++;
            }
        } 
        System.out.println("Number of " + letter + ": " + count);
    }
}