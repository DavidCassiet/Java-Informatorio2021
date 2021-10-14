import java.util.ArrayList;
import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();
        int sizeb = 0;

        for (int i=1; i<=5; i++) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            list.add(number);
            sizeb++;
        }

        System.out.print("Enter beginning number: ");
        int numberb = scanner.nextInt();
        list.add(0, numberb);
        System.out.print("Enter end number: ");
        int numbere = scanner.nextInt();
        list.add(sizeb + 1, numbere);

        for (int element : list) {
            System.out.println(element);
        }

        scanner.close();
        int sizea = sizeb + 2;

        System.out.println("Size before: " + sizeb + ", size after: " + sizea);
    }
    
}
