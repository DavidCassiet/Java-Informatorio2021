import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercise5 {
    public static void main(String[] args) {
        List<Student> students = List.of(
                new Student("Homero", "Simpson", LocalDate.now().minusYears(30)),
                new Student("Lisa", "Simpson", LocalDate.of(1956, 5, 12)),
                new Student("Bart", "Simpson", LocalDate.of(1990, 2, 10)),
                new Student("Maggie", "Simpson", LocalDate.of(2001, 3, 30)),
                new Student("Marge", "Bouvier", LocalDate.of(1954, 2, 5)),
                new Student("Marvin", "Monroe", LocalDate.of(1945, 7, 21)),
                new Student("Abbe", "Simpson", LocalDate.of(1911, 11, 11)));
        Map<String, Integer> studentsAges = students.stream()
                .collect(Collectors
                .toMap(p-> (p.getName() + " " + p.getSurname()),
                        p -> Exercise5.getAge(p.getBirthday())));
        System.out.println(studentsAges);
    }
    public static Integer getAge(LocalDate birthDate){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }
}
