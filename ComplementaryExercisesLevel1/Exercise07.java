import java.util.Scanner;

public class Exercise07 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lowercase string :");
        String string = scanner.nextLine();
        scanner.close();
        char[] newString = new char[string.length()];
        
        for(int i = 0; i < string.length(); i++) {
            newString[i] = (char) (string.charAt(i) - 32);
        } 
        System.out.println(newString);
    }
}