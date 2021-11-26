import java.util.*;

public class Exercise06 {
    public static void main(String[] args) {
        
        Employee employee1 = new Employee("Employee", "One", 25854356, 48, 200);
        Employee employee2 = new Employee("Employee", "Two", 45622678, 23, 200);
        Employee employee3 = new Employee("Employee", "Three", 33467253, 53, 200);
        Employee employee4 = new Employee("Employee", "Four", 22234532, 45, 200);
        
        Set<Employee> setEmployees = new HashSet<Employee>();
        Map<Integer, Integer> mapEmployees = new HashMap<Integer, Integer>();
        setEmployees.add(employee1); setEmployees.add(employee2); setEmployees.add(employee3); setEmployees.add(employee4);

        for(Employee employee:setEmployees) {
            int value = employee.getWorkedHours() * employee.getValuePerHour();
            mapEmployees.put(employee.getDni(), value);
        }
        System.out.println(mapEmployees);

        // setEmployees.forEach(employee -> {
        //     int value = employee.getWorkedHours() * employee.getValuePerHour();
        //     mapEmployees.put(employee.getDni(), value);
        // });
        // System.out.println(mapEmployees);
    }
}