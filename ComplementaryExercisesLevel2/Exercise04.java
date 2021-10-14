import java.util.*;

public class Exercise04 {

    public static void main(String[] args) {

        ArrayList<String>students = new ArrayList<String>();
        students.add("StudentA");
        students.add("StudentB");
        students.add("StudentC");
        students.add("StudentD");
        students.add("StudentE");
        students.add("StudentF");
        students.add("StudentG");
        students.add("StudentH");
        students.add("StudentI");
        students.add("StudentJ");
        students.add("StudentK");
        students.add("StudentL");

        System.out.println("Total students: " + students);

        List<String>classroom1 = students.subList(0, 4);
        List<String>classroom2 = students.subList(4, 8);
        List<String>classroom3 = students.subList(8, 12);

        System.out.println("Classroom 1: " + classroom1);
        System.out.println("Classroom 2: " + classroom2);
        System.out.println("Classroom 3: " + classroom3);

    }
    
}
